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
public class Stock
{

    private String commision;
    private Date tradeDate;
    private String daysLow;
    private String daysHigh;
    private String holdingsGain;
    private String holdingsGainRealtime;
    private String marketCapRealtime;
    private String highLimit;
    private String lowLimit;
    private String open;
    private String pricePaid;
    private String PERationRealtime;
    private String sharesOwned;
    private String holdingsValue;
    private String holdingsValueRealtime;

    private String symbol;
    private BigDecimal ask;
    private Long averageDailyVolume;
    private BigDecimal bid;
    private BigDecimal askRealtime;
    private BigDecimal bidRealtime;
    private BigDecimal bookValue;
    private String changePercentChange;
    private BigDecimal change;
    private BigDecimal changeRealtime;
    private String afterHoursChangeRealtime;
    private BigDecimal dividendShare;
    private Date lastTradeDate;
    private BigDecimal earningsShare;
    private String errorIndicationreturnedforsymbolchangedinvalid;
    private BigDecimal EPSEstimateCurrentYear;
    private BigDecimal EPSEstimateNextYear;
    private BigDecimal EPSEstimateNextQuarter;
    private BigDecimal yearLow;
    private BigDecimal yearHigh;
    private String holdingsGainPercent;
    private String annualizedGain;
    private String holdingsGainPercentRealtime;
    private String moreInfo;
    private String orderBookRealtime;
    private String marketCapitalization;
    private String EBITDA;
    private BigDecimal changeFromYearLow;
    private String percentChangeFromYearLow;
    private String lastTradeRealtimeWithTime;
    private String changePercentRealtime;
    private BigDecimal changeFromYearHigh;
    private String percebtChangeFromYearHigh;
    private String lastTradeWithTime;
    private String lastTradePriceOnly;
    private String daysRange;
    private String daysRangeRealtime;
    private BigDecimal fiftydayMovingAverage;
    private BigDecimal twoHundreddayMovingAverage;
    private BigDecimal changeFromTwoHundreddayMovingAverage;
    private String percentChangeFromTwoHundreddayMovingAverage;
    private BigDecimal changeFromFiftydayMovingAverage;
    private String percentChangeFromFiftydayMovingAverage;
    private String name;
    private String notes;
    private BigDecimal previousClose;
    private String changeinPercent;
    private BigDecimal priceSales;
    private BigDecimal priceBook;
    private Date exDividendDate;
    private BigDecimal PERatio;
    private String dividendPayDate; // TODO: type
    private BigDecimal PEGRatio;
    private BigDecimal priceEPSEstimateCurrentYear;
    private BigDecimal priceEPSEstimateNextYear;
    private BigDecimal shortRatio;
    private String lastTradeTime;
    private String tickerTrend;
    private BigDecimal oneyrTargetPrice;
    private Long volume;
    private String yearRange;
    private String daysValueChange;
    private String daysValueChangeRealtime;
    private String stockExchange;
    private String dividendYield;
    private String percentChange;
    private String currency;

    public Stock()
    {

    }

    /**
     * Constructor.
     * @param symbol the stock symbol
     */
    public Stock(String symbol)
    {
        this.symbol = symbol;
    }

    public String getEBITDA()
    {
        return EBITDA;
    }

    public void setEBITDA(String EBITDA)
    {
        this.EBITDA = EBITDA;
    }

    public BigDecimal getEPSEstimateCurrentYear()
    {
        return EPSEstimateCurrentYear;
    }

    public void setEPSEstimateCurrentYear(BigDecimal EPSEstimateCurrentYear)
    {
        this.EPSEstimateCurrentYear = EPSEstimateCurrentYear;
    }

    public BigDecimal getEPSEstimateNextQuarter()
    {
        return EPSEstimateNextQuarter;
    }

    public void setEPSEstimateNextQuarter(BigDecimal EPSEstimateNextQuarter)
    {
        this.EPSEstimateNextQuarter = EPSEstimateNextQuarter;
    }

    public BigDecimal getEPSEstimateNextYear()
    {
        return EPSEstimateNextYear;
    }

    public void setEPSEstimateNextYear(BigDecimal EPSEstimateNextYear)
    {
        this.EPSEstimateNextYear = EPSEstimateNextYear;
    }

    public BigDecimal getPEGRatio()
    {
        return PEGRatio;
    }

    public void setPEGRatio(BigDecimal PEGRatio)
    {
        this.PEGRatio = PEGRatio;
    }

    public BigDecimal getPERatio()
    {
        return PERatio;
    }

    public void setPERatio(BigDecimal PERatio)
    {
        this.PERatio = PERatio;
    }

    public String getPERationRealtime()
    {
        return PERationRealtime;
    }

    public void setPERationRealtime(String PERationRealtime)
    {
        this.PERationRealtime = PERationRealtime;
    }

    public String getAfterHoursChangeRealtime()
    {
        return afterHoursChangeRealtime;
    }

    public void setAfterHoursChangeRealtime(String afterHoursChangeRealtime)
    {
        this.afterHoursChangeRealtime = afterHoursChangeRealtime;
    }

    public String getAnnualizedGain()
    {
        return annualizedGain;
    }

    public void setAnnualizedGain(String annualizedGain)
    {
        this.annualizedGain = annualizedGain;
    }

    public BigDecimal getAsk()
    {
        return ask;
    }

    public void setAsk(BigDecimal ask)
    {
        this.ask = ask;
    }

    public BigDecimal getAskRealtime()
    {
        return askRealtime;
    }

    public void setAskRealtime(BigDecimal askRealtime)
    {
        this.askRealtime = askRealtime;
    }

    public Long getAverageDailyVolume()
    {
        return averageDailyVolume;
    }

    public void setAverageDailyVolume(Long averageDailyVolume)
    {
        this.averageDailyVolume = averageDailyVolume;
    }

    public BigDecimal getBid()
    {
        return bid;
    }

    public void setBid(BigDecimal bid)
    {
        this.bid = bid;
    }

    public BigDecimal getBidRealtime()
    {
        return bidRealtime;
    }

    public void setBidRealtime(BigDecimal bidRealtime)
    {
        this.bidRealtime = bidRealtime;
    }

    public BigDecimal getBookValue()
    {
        return bookValue;
    }

    public void setBookValue(BigDecimal bookValue)
    {
        this.bookValue = bookValue;
    }

    public BigDecimal getChange()
    {
        return change;
    }

    public void setChange(BigDecimal change)
    {
        this.change = change;
    }

    public BigDecimal getChangeFromFiftydayMovingAverage()
    {
        return changeFromFiftydayMovingAverage;
    }

    public void setChangeFromFiftydayMovingAverage(BigDecimal changeFromFiftydayMovingAverage)
    {
        this.changeFromFiftydayMovingAverage = changeFromFiftydayMovingAverage;
    }

    public BigDecimal getChangeFromTwoHundreddayMovingAverage()
    {
        return changeFromTwoHundreddayMovingAverage;
    }

    public void setChangeFromTwoHundreddayMovingAverage(BigDecimal changeFromTwoHundreddayMovingAverage)
    {
        this.changeFromTwoHundreddayMovingAverage = changeFromTwoHundreddayMovingAverage;
    }

    public BigDecimal getChangeFromYearHigh()
    {
        return changeFromYearHigh;
    }

    public void setChangeFromYearHigh(BigDecimal changeFromYearHigh)
    {
        this.changeFromYearHigh = changeFromYearHigh;
    }

    public BigDecimal getChangeFromYearLow()
    {
        return changeFromYearLow;
    }

    public void setChangeFromYearLow(BigDecimal changeFromYearLow)
    {
        this.changeFromYearLow = changeFromYearLow;
    }

    public String getChangePercentRealtime()
    {
        return changePercentRealtime;
    }

    public void setChangePercentRealtime(String changePercentRealtime)
    {
        this.changePercentRealtime = changePercentRealtime;
    }

    public BigDecimal getChangeRealtime()
    {
        return changeRealtime;
    }

    public void setChangeRealtime(BigDecimal changeRealtime)
    {
        this.changeRealtime = changeRealtime;
    }

    public String getChange_PercentChange()
    {
        return changePercentChange;
    }

    /**
     * The underscore in the methodname is needed due to the fact
     * we set this value via reflection and Yahoo delivers the name
     * with an underscore. So it's not an inconsistency on our side.
     */
    public void setChange_PercentChange(String change_PercentChange)
    {
        this.changePercentChange = change_PercentChange;
    }

    public String getChangeinPercent()
    {
        return changeinPercent;
    }

    public void setChangeinPercent(String changeinPercent)
    {
        this.changeinPercent = changeinPercent;
    }

    public String getCommision()
    {
        return commision;
    }

    public void setCommision(String commision)
    {
        this.commision = commision;
    }

    public String getDaysHigh()
    {
        return daysHigh;
    }

    public void setDaysHigh(String daysHigh)
    {
        this.daysHigh = daysHigh;
    }

    public String getDaysLow()
    {
        return daysLow;
    }

    public void setDaysLow(String daysLow)
    {
        this.daysLow = daysLow;
    }

    public String getDaysRange()
    {
        return daysRange;
    }

    public void setDaysRange(String daysRange)
    {
        this.daysRange = daysRange;
    }

    public String getDaysRangeRealtime()
    {
        return daysRangeRealtime;
    }

    public void setDaysRangeRealtime(String daysRangeRealtime)
    {
        this.daysRangeRealtime = daysRangeRealtime;
    }

    public String getDaysValueChange()
    {
        return daysValueChange;
    }

    public void setDaysValueChange(String daysValueChange)
    {
        this.daysValueChange = daysValueChange;
    }

    public String getDaysValueChangeRealtime()
    {
        return daysValueChangeRealtime;
    }

    public void setDaysValueChangeRealtime(String daysValueChangeRealtime)
    {
        this.daysValueChangeRealtime = daysValueChangeRealtime;
    }

    public String getDividendPayDate()
    {
        return dividendPayDate;
    }

    public void setDividendPayDate(String dividendPayDate)
    {
        this.dividendPayDate = dividendPayDate;
    }

    public BigDecimal getDividendShare()
    {
        return dividendShare;
    }

    public void setDividendShare(BigDecimal dividendShare)
    {
        this.dividendShare = dividendShare;
    }

    public String getDividendYield()
    {
        return dividendYield;
    }

    public void setDividendYield(String dividendYield)
    {
        this.dividendYield = dividendYield;
    }

    public BigDecimal getEarningsShare()
    {
        return earningsShare;
    }

    public void setEarningsShare(BigDecimal earningsShare)
    {
        this.earningsShare = earningsShare;
    }

    public String getErrorIndicationreturnedforsymbolchangedinvalid()
    {
        return errorIndicationreturnedforsymbolchangedinvalid;
    }

    public void setErrorIndicationreturnedforsymbolchangedinvalid(String errorIndicationreturnedforsymbolchangedinvalid)
    {
        this.errorIndicationreturnedforsymbolchangedinvalid = errorIndicationreturnedforsymbolchangedinvalid;
    }

    public Date getExDividendDate()
    {
        return exDividendDate;
    }

    public void setExDividendDate(Date exDividendDate)
    {
        this.exDividendDate = exDividendDate;
    }

    public BigDecimal getFiftydayMovingAverage()
    {
        return fiftydayMovingAverage;
    }

    public void setFiftydayMovingAverage(BigDecimal fiftydayMovingAverage)
    {
        this.fiftydayMovingAverage = fiftydayMovingAverage;
    }

    public String getHighLimit()
    {
        return highLimit;
    }

    public void setHighLimit(String highLimit)
    {
        this.highLimit = highLimit;
    }

    public String getHoldingsGain()
    {
        return holdingsGain;
    }

    public void setHoldingsGain(String holdingsGain)
    {
        this.holdingsGain = holdingsGain;
    }

    public String getHoldingsGainPercent()
    {
        return holdingsGainPercent;
    }

    public void setHoldingsGainPercent(String holdingsGainPercent)
    {
        this.holdingsGainPercent = holdingsGainPercent;
    }

    public String getHoldingsGainPercentRealtime()
    {
        return holdingsGainPercentRealtime;
    }

    public void setHoldingsGainPercentRealtime(String holdingsGainPercentRealtime)
    {
        this.holdingsGainPercentRealtime = holdingsGainPercentRealtime;
    }

    public String getHoldingsGainRealtime()
    {
        return holdingsGainRealtime;
    }

    public void setHoldingsGainRealtime(String holdingsGainRealtime)
    {
        this.holdingsGainRealtime = holdingsGainRealtime;
    }

    public String getHoldingsValue()
    {
        return holdingsValue;
    }

    public void setHoldingsValue(String holdingsValue)
    {
        this.holdingsValue = holdingsValue;
    }

    public String getHoldingsValueRealtime()
    {
        return holdingsValueRealtime;
    }

    public void setHoldingsValueRealtime(String holdingsValueRealtime)
    {
        this.holdingsValueRealtime = holdingsValueRealtime;
    }

    public Date getLastTradeDate()
    {
        return lastTradeDate;
    }

    public void setLastTradeDate(Date lastTradeDate)
    {
        this.lastTradeDate = lastTradeDate;
    }

    public String getLastTradePriceOnly()
    {
        return lastTradePriceOnly;
    }

    public void setLastTradePriceOnly(String lastTradePriceOnly)
    {
        this.lastTradePriceOnly = lastTradePriceOnly;
    }

    public String getLastTradeRealtimeWithTime()
    {
        return lastTradeRealtimeWithTime;
    }

    public void setLastTradeRealtimeWithTime(String lastTradeRealtimeWithTime)
    {
        this.lastTradeRealtimeWithTime = lastTradeRealtimeWithTime;
    }

    public String getLastTradeTime()
    {
        return lastTradeTime;
    }

    public void setLastTradeTime(String lastTradeTime)
    {
        this.lastTradeTime = lastTradeTime;
    }

    public String getLastTradeWithTime()
    {
        return lastTradeWithTime;
    }

    public void setLastTradeWithTime(String lastTradeWithTime)
    {
        this.lastTradeWithTime = lastTradeWithTime;
    }

    public String getLowLimit()
    {
        return lowLimit;
    }

    public void setLowLimit(String lowLimit)
    {
        this.lowLimit = lowLimit;
    }

    public String getMarketCapRealtime()
    {
        return marketCapRealtime;
    }

    public void setMarketCapRealtime(String marketCapRealtime)
    {
        this.marketCapRealtime = marketCapRealtime;
    }

    public String getMarketCapitalization()
    {
        return marketCapitalization;
    }

    public void setMarketCapitalization(String marketCapitalization)
    {
        this.marketCapitalization = marketCapitalization;
    }

    public String getMoreInfo()
    {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo)
    {
        this.moreInfo = moreInfo;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getNotes()
    {
        return notes;
    }

    public void setNotes(String notes)
    {
        this.notes = notes;
    }

    public BigDecimal getOneyrTargetPrice()
    {
        return oneyrTargetPrice;
    }

    public void setOneyrTargetPrice(BigDecimal oneyrTargetPrice)
    {
        this.oneyrTargetPrice = oneyrTargetPrice;
    }

    public String getOpen()
    {
        return open;
    }

    public void setOpen(String open)
    {
        this.open = open;
    }

    public String getOrderBookRealtime()
    {
        return orderBookRealtime;
    }

    public void setOrderBookRealtime(String orderBookRealtime)
    {
        this.orderBookRealtime = orderBookRealtime;
    }

    public String getPercebtChangeFromYearHigh()
    {
        return percebtChangeFromYearHigh;
    }

    public void setPercebtChangeFromYearHigh(String percebtChangeFromYearHigh)
    {
        this.percebtChangeFromYearHigh = percebtChangeFromYearHigh;
    }

    public String getPercentChange()
    {
        return percentChange;
    }

    public void setPercentChange(String percentChange)
    {
        this.percentChange = percentChange;
    }

    public String getPercentChangeFromFiftydayMovingAverage()
    {
        return percentChangeFromFiftydayMovingAverage;
    }

    public void setPercentChangeFromFiftydayMovingAverage(String percentChangeFromFiftydayMovingAverage)
    {
        this.percentChangeFromFiftydayMovingAverage = percentChangeFromFiftydayMovingAverage;
    }

    public String getPercentChangeFromTwoHundreddayMovingAverage()
    {
        return percentChangeFromTwoHundreddayMovingAverage;
    }

    public void setPercentChangeFromTwoHundreddayMovingAverage(String percentChangeFromTwoHundreddayMovingAverage)
    {
        this.percentChangeFromTwoHundreddayMovingAverage = percentChangeFromTwoHundreddayMovingAverage;
    }

    public String getPercentChangeFromYearLow()
    {
        return percentChangeFromYearLow;
    }

    public void setPercentChangeFromYearLow(String percentChangeFromYearLow)
    {
        this.percentChangeFromYearLow = percentChangeFromYearLow;
    }

    public BigDecimal getPreviousClose()
    {
        return previousClose;
    }

    public void setPreviousClose(BigDecimal previousClose)
    {
        this.previousClose = previousClose;
    }

    public BigDecimal getPriceBook()
    {
        return priceBook;
    }

    public void setPriceBook(BigDecimal priceBook)
    {
        this.priceBook = priceBook;
    }

    public BigDecimal getPriceEPSEstimateCurrentYear()
    {
        return priceEPSEstimateCurrentYear;
    }

    public void setPriceEPSEstimateCurrentYear(BigDecimal priceEPSEstimateCurrentYear)
    {
        this.priceEPSEstimateCurrentYear = priceEPSEstimateCurrentYear;
    }

    public BigDecimal getPriceEPSEstimateNextYear()
    {
        return priceEPSEstimateNextYear;
    }

    public void setPriceEPSEstimateNextYear(BigDecimal priceEPSEstimateNextYear)
    {
        this.priceEPSEstimateNextYear = priceEPSEstimateNextYear;
    }

    public String getPricePaid()
    {
        return pricePaid;
    }

    public void setPricePaid(String pricePaid)
    {
        this.pricePaid = pricePaid;
    }

    public BigDecimal getPriceSales()
    {
        return priceSales;
    }

    public void setPriceSales(BigDecimal priceSales)
    {
        this.priceSales = priceSales;
    }

    public String getSharesOwned()
    {
        return sharesOwned;
    }

    public void setSharesOwned(String sharesOwned)
    {
        this.sharesOwned = sharesOwned;
    }

    public BigDecimal getShortRatio()
    {
        return shortRatio;
    }

    public void setShortRatio(BigDecimal shortRatio)
    {
        this.shortRatio = shortRatio;
    }

    public String getStockExchange()
    {
        return stockExchange;
    }

    public void setStockExchange(String stockExchange)
    {
        this.stockExchange = stockExchange;
    }

    public String getSymbol()
    {
        return symbol;
    }

    public void setSymbol(String symbol)
    {
        this.symbol = symbol;
    }

    public String getTickerTrend()
    {
        return tickerTrend;
    }

    public void setTickerTrend(String tickerTrend)
    {
        this.tickerTrend = tickerTrend;
    }

    public Date getTradeDate()
    {
        return tradeDate;
    }

    public void setTradeDate(Date tradeDate)
    {
        this.tradeDate = tradeDate;
    }

    public BigDecimal getTwoHundreddayMovingAverage()
    {
        return twoHundreddayMovingAverage;
    }

    public void setTwoHundreddayMovingAverage(BigDecimal twoHundreddayMovingAverage)
    {
        this.twoHundreddayMovingAverage = twoHundreddayMovingAverage;
    }

    public Long getVolume()
    {
        return volume;
    }

    public void setVolume(Long volume)
    {
        this.volume = volume;
    }

    public BigDecimal getYearHigh()
    {
        return yearHigh;
    }

    public void setYearHigh(BigDecimal yearHigh)
    {
        this.yearHigh = yearHigh;
    }

    public BigDecimal getYearLow()
    {
        return yearLow;
    }

    public void setYearLow(BigDecimal yearLow)
    {
        this.yearLow = yearLow;
    }

    public String getYearRange()
    {
        return yearRange;
    }

    public void setYearRange(String yearRange)
    {
        this.yearRange = yearRange;
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency(String currency)
    {
        this.currency = currency;
    }
   
}
