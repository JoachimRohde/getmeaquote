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

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Joachim F. Rohde
 */
public class HistoricalQuote
{

    private Date date;
    private BigDecimal open;
    private BigDecimal high;
    private BigDecimal low;
    private BigDecimal close;
    private Long volume;
    private BigDecimal adj;

    /**
     * Returns the quote adjusted from splits, dividends, etc. for the stock.
     * E.g. If the stock splitted in the past by 1:2 and the current quote is
     * 100,00 $ the adjusted quote would be 200,00 $-
     *
     * @return the adjusted price for the stock for the given date
     *
     */
    public BigDecimal getAdj()
    {
        return adj;
    }

    public void setAdj(BigDecimal adj)
    {
        this.adj = adj;
    }

    /**
     * Returns the closing price for this stock on the specified date.
     *
     * @return the closing price.
     */
    public BigDecimal getClose()
    {
        return close;
    }

    public void setClose(BigDecimal close)
    {
        this.close = close;
    }

    /**
     * Returns the date the given data was valid.
     *
     * @return the date the data was valid
     */
    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    /**
     * Returns the highest price for the stock on the given date.
     *
     * @return the highest price
     */
    public BigDecimal getHigh()
    {
        return high;
    }

    public void setHigh(BigDecimal high)
    {
        this.high = high;
    }

    /**
     * Returns the lowest price for the stock on the given date.
     *
     * @return the lowest price.
     */
    public BigDecimal getLow()
    {
        return low;
    }

    public void setLow(BigDecimal low)
    {
        this.low = low;
    }

    /**
     * Returns the opening price for the stock on the given date.
     */
    public BigDecimal getOpen()
    {
        return open;
    }

    public void setOpen(BigDecimal open)
    {
        this.open = open;
    }

    /**
     * Returns the traded volume of the stock on the given date.
     */
    public Long getVolume()
    {
        return volume;
    }

    public void setVolume(Long volume)
    {
        this.volume = volume;
    }
}
