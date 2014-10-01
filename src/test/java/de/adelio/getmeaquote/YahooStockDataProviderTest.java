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
package de.adelio.getmeaquote;

import de.adelio.getmeaquote.stockdataprovider.StockDataProvider;
import de.adelio.getmeaquote.stockdataprovider.yahoo.YahooStockDataProvider;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple YahooStockDataProvider.
 * @author Joachim F. Rohde
 */
public class YahooStockDataProviderTest extends TestCase
{

    /**
     * Create the test case.
     *
     * @param testName name of the test case
     */
    public YahooStockDataProviderTest(String testName)
    {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite(YahooStockDataProviderTest.class);
    }

    /**
     * Get some historical quotes.
     */
    public void testHistoricalQuotes()
    {

        try
        {
            StockDataProvider sdp = new YahooStockDataProvider();
            Date startDate = new Date(114, 1, 5);
            Date endDate = new Date(114, 1, 6);
            HistoricalQuote hq = sdp.getHistoricalQuote("MOR.DE", endDate);
            assertEquals(63.92, hq.getAdj().doubleValue(), 0.0);
            assertEquals(63.92, hq.getOpen().doubleValue(), 0.0);
            assertEquals(64.50, hq.getHigh().doubleValue(), 0.0);
            assertEquals(63.12, hq.getLow().doubleValue(), 0.0);
            assertEquals(63.92, hq.getClose().doubleValue(), 0.0);
            assertEquals(85400L, hq.getVolume().longValue());

            List<HistoricalQuote> list = sdp.getHistoricalQuotes("MOR.DE", startDate, endDate, "d");
            assertEquals(2, list.size());
        }
        catch (IOException ex)
        {
            Logger.getLogger(YahooStockDataProviderTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Test getting the name of a stock-symbol.
     */
    public void testGetName()
    {
        StockDataProvider sdp = new YahooStockDataProvider();
        Stock mystock = sdp.fetchData("MOR.DE");
        assertEquals("Morphosys".toLowerCase(), mystock.getName().toLowerCase());

    }
}
