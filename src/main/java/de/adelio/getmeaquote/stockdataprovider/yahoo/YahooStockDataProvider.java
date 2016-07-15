/**
 * Copyright 2014 Joachim F. Rohde
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.adelio.getmeaquote.stockdataprovider.yahoo;

import de.adelio.getmeaquote.HistoricalQuote;
import de.adelio.getmeaquote.Stock;
import de.adelio.getmeaquote.stockdataprovider.StockDataProvider;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Joachim F. Rohde
 */
public class YahooStockDataProvider implements StockDataProvider
{

    /**
     * A list of historical quotes.
     *
     * @param symbol the symbol of the stock
     * @param startDate the start date of the first historical quote in the list
     * @param endDate the end date of the last historical quote in the list
     * @param interval the interval the data should be provided. "d" for daily quotes, "w" for weekly and "m" for monthly
     * @return a list of historical quotes
     * @throws IOException if something goes wrong while reading the data from Yahoo
     * @see de.adelio.getmeaquote.HistoricalQuote
     */
    public List<HistoricalQuote> getHistoricalQuotes(String symbol, Date startDate, Date endDate, String interval) throws IOException
    {
        ArrayList<HistoricalQuote> quoteList = new ArrayList<HistoricalQuote>();

        /*
         * The paramaters in the URL are as follows: a = month of the startDate
         * b = day of the startDate c = year of the startdate d = month of the
         * endDate e = day of the endDate f = year of the endDate g = interval
         * (see JavaDoc)
         */
        Calendar cal = Calendar.getInstance();
        cal.setTime(startDate);
        int startmonth = cal.get(Calendar.MONTH);
        int startday = cal.get(Calendar.DAY_OF_MONTH);
        int startyear = cal.get(Calendar.YEAR);
        cal.setTime(endDate);
        int endmonth = cal.get(Calendar.MONTH);
        int endday = cal.get(Calendar.DAY_OF_MONTH);
        int endyear = cal.get(Calendar.YEAR);
//        URL yahoo = new URL("http://ichart.finance.yahoo.com/table.csv?s=" + symbol + "&a=" + startDate.getMonth() + "&b=" + startDate.getDay() + "&c=" + (startDate.getYear() + 1900) + "&d=" + endDate.getMonth() + "&e=" + endDate.getDay() + "&f=" + (endDate.getYear() + 1900) + "&g=" + interval + "&ignore=.csv");
        URL yahoo = new URL("http://ichart.finance.yahoo.com/table.csv?s=" + symbol + "&a=" + startmonth + "&b=" + startday + "&c=" + startyear + "&d=" + endmonth + "&e=" + endday + "&f=" + endyear + "&g=" + interval + "&ignore=.csv");
        BufferedReader in = new BufferedReader(new InputStreamReader(yahoo.openStream()));
        String inputLine;
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        try
        {
            while ((inputLine = in.readLine()) != null)
            {
                String[] values = inputLine.split(",");
                try
                {
                    HistoricalQuote histQuote = new HistoricalQuote();
                    histQuote.setDate(df.parse(values[0]));
                    histQuote.setOpen(new BigDecimal(values[1]));
                    histQuote.setHigh(new BigDecimal(values[2]));
                    histQuote.setLow(new BigDecimal(values[3]));
                    histQuote.setClose(new BigDecimal(values[4]));
                    histQuote.setVolume(new Long(values[5]));
                    histQuote.setAdj(new BigDecimal(values[6]));
                    quoteList.add(histQuote);
                }
                catch (ParseException pex)
                {
                    // do nothing
                    // will be thrown at least once, at the first line where the header resides
                }
            }
        }
        finally
        {
            in.close();
        }

        return quoteList;
    }

    /**
     * Returns a historical quote for a specified stock on a specified date.
     *
     * @param symbol the symbol of the stock
     * @param date the date for which the data should be fetch
     * @return a historical quote for the specified stock on a given date or
     * null if no date could be retrieved
     * @throws IOException if something goes wrong while fetching the data
     * @see de.adelio.getmeaquote.HistoricalQuote
     */
    public HistoricalQuote getHistoricalQuote(String symbol, Date date) throws IOException
    {
        List<HistoricalQuote> hq = getHistoricalQuotes(symbol, date, date, "d");
        if (hq.isEmpty())
        {
            return null;
        }
        else
        {
            return getHistoricalQuotes(symbol, date, date, "d").get(0);
        }
    }

    /**
     * Fetches the data for a stock specified by its symbol.
     *
     * @param symbol the symbol of the stock
     * @return a Stock object containing all the data
     * @see de.adelio.getmeaquote.Stock
     */
    public Stock fetchData(String symbol)
    {

        Stock stock = new Stock();

        //TODO: allow more than one symbol  
        symbol = symbol.replaceAll(",", "%2C");
        symbol = symbol.replaceAll("\"", "%22");
        symbol = "%22" + symbol + "%22";
        try
        {
            URL yahoo = new URL("http://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.quotes%20where%20symbol%20in%20(" + symbol + ")%0A%09%09&diagnostics=true&env=http%3A%2F%2Fdatatables.org%2Falltables.env");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(yahoo.openStream());
            doc.getDocumentElement().normalize();

            XPath xpath = XPathFactory.newInstance().newXPath();
            NodeList quoteList = (NodeList) xpath.evaluate("//quote", doc, XPathConstants.NODESET);
            for (int s = 0; s < quoteList.getLength(); s++)
            {
                Node quoteNode = quoteList.item(s);
                NodeList quoteElements = quoteNode.getChildNodes();
                for (int i = 0; i < quoteElements.getLength(); i++)
                {
                    Node element = quoteElements.item(i);
                    // check if this node has a value
                    if (element.getChildNodes().getLength() > 0)
                    {
                        // yes, it has a value...
                        // now set the value in our bean
                        // first set everything which is BigDecimal value
                        if (element.getNodeName().equalsIgnoreCase("ask")
                                || element.getNodeName().equalsIgnoreCase("bid")
                                || element.getNodeName().equalsIgnoreCase("askRealtime")
                                || element.getNodeName().equalsIgnoreCase("bidRealtime")
                                || element.getNodeName().equalsIgnoreCase("bookValue")
                                || element.getNodeName().equalsIgnoreCase("change")
                                || element.getNodeName().equalsIgnoreCase("changeRealtime")
                                || element.getNodeName().equalsIgnoreCase("dividendShare")
                                || element.getNodeName().equalsIgnoreCase("earningsShare")
                                || element.getNodeName().equalsIgnoreCase("EPSEstimateCurrentYear")
                                || element.getNodeName().equalsIgnoreCase("EPSEstimateNextYear")
                                || element.getNodeName().equalsIgnoreCase("EPSEstimateNextQuarter")
                                || element.getNodeName().equalsIgnoreCase("yearLow")
                                || element.getNodeName().equalsIgnoreCase("yearHigh")
                                || element.getNodeName().equalsIgnoreCase("changeFromYearLow")
                                || element.getNodeName().equalsIgnoreCase("changeFromYearHigh")
                                || element.getNodeName().equalsIgnoreCase("fiftydayMovingAverage")
                                || element.getNodeName().equalsIgnoreCase("twoHundreddayMovingAverage")
                                || element.getNodeName().equalsIgnoreCase("changeFromTwoHundreddayMovingAverage")
                                || element.getNodeName().equalsIgnoreCase("changeFromFiftydayMovingAverage")
                                || element.getNodeName().equalsIgnoreCase("previousClose")
                                || element.getNodeName().equalsIgnoreCase("priceSales")
                                || element.getNodeName().equalsIgnoreCase("priceBook")
                                || element.getNodeName().equalsIgnoreCase("PERatio")
                                || element.getNodeName().equalsIgnoreCase("PEGRatio")
                                || element.getNodeName().equalsIgnoreCase("priceEPSEstimateCurrentYear")
                                || element.getNodeName().equalsIgnoreCase("priceEPSEstimateNextYear")
                                || element.getNodeName().equalsIgnoreCase("shortRatio")
                                || element.getNodeName().equalsIgnoreCase("oneyrTargetPrice"))
                        {

                            Class cls = stock.getClass();
                            Class partypes[] = new Class[1];
                            partypes[0] = BigDecimal.class;
                            Method meth = cls.getMethod("set" + element.getNodeName(), partypes);
                            Object arglist[] = new Object[1];
                            arglist[0] = new BigDecimal(element.getChildNodes().item(0).getNodeValue());
                            meth.invoke(stock, arglist);
                        } // now set everything which is a Long value
                        else if (element.getNodeName().equalsIgnoreCase("averageDailyVolume")
                                || element.getNodeName().equalsIgnoreCase("volume"))
                        {
                            Class cls = stock.getClass();
                            Class partypes[] = new Class[1];
                            partypes[0] = Long.class;
                            Method meth = cls.getMethod("set" + element.getNodeName(), partypes);
                            Object arglist[] = new Object[1];
                            arglist[0] = new Long(element.getChildNodes().item(0).getNodeValue());
                            meth.invoke(stock, arglist);
                        } // now set everything which is a Date value
                        else if (element.getNodeName().equalsIgnoreCase("lastTradeDate")
                                || element.getNodeName().equalsIgnoreCase("exDividendDate")
                                || element.getNodeName().equalsIgnoreCase("tradeDate"))
                        {
                            Class cls = stock.getClass();
                            Class partypes[] = new Class[1];
                            partypes[0] = Date.class;
                            Method meth = cls.getMethod("set" + element.getNodeName(), partypes);
                            Object arglist[] = new Object[1];
                            arglist[0] = new Date(element.getChildNodes().item(0).getNodeValue());
                            meth.invoke(stock, arglist);
                        }
                        else
                        {
                            // read in the other values which are from the type String
                            // to save some typing-work we use reflection to read in the rest
                            try
                            {
                                Class cls = stock.getClass();
                                Class partypes[] = new Class[1];
                                partypes[0] = String.class;
                                Method meth = cls.getMethod("set" + element.getNodeName(), partypes);
                                Object arglist[] = new Object[1];
                                arglist[0] = element.getChildNodes().item(0).getNodeValue();
                                meth.invoke(stock, arglist);
                            }
                            catch (Throwable e)
                            {
                                System.err.println(e);
                            }
                        }

                    }
                }

            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return stock;
    }
}
