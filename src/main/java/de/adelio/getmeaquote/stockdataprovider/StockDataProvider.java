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
package de.adelio.getmeaquote.stockdataprovider;

import de.adelio.getmeaquote.HistoricalQuote;
import de.adelio.getmeaquote.Stock;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Joachim F. Rohde
 */
public interface StockDataProvider
{

    /**
     * Fetches the data for a stock specified by its symbol.
     *
     * @param symbol the symbol of the stock
     * @return a Stock object containing all the data
     * @see de.adelio.getmeaquote.Stock
     */
    Stock fetchData(String symbol);

    /**
     * A list of historical quotes.
     *
     * @param symbol the symbol of the stock
     * @param startDate the start date of the first historical quote in the list
     * @param endDate the end date of the last historical quote in the list
     * @param interval the interval the data should be provided. "d" for daily
     * quotes, "w" for weekly and "m" for monthly
     * @return a list of historical quotes
     * @throws IOException if something goes wrong while fetching the data
     * @see de.adelio.getmeaquote.HistoricalQuote
     */
    List<HistoricalQuote> getHistoricalQuotes(String symbol, Date startDate, Date endDate, String interval) throws IOException;

    /**
     * Returns a historical quote for a specified stock on a specified date.
     *
     * @param symbol the symbol of the stock
     * @param date the date for which the data should be fetch
     * @return a historical quote for the specified stock on a given date
     * @throws IOException if something goes wrong while fetching the data
     * @see de.adelio.getmeaquote.HistoricalQuote
     */
    HistoricalQuote getHistoricalQuote(String symbol, Date date) throws IOException;
}
