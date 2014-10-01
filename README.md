Get me a quote
==============

Overview
------------
This is a small Java library to query the finance API of Yahoo to get stock data and historical quotes.

How to use it
-------------
It's pretty straight forward.

To get the data of a stock, use:

```
        StockDataProvider sdp = new YahooStockDataProvider();
        Stock mystock = sdp.fetchData("MOR.DE");
```

You need to pass fetchData the stock symbol (in this example we use the symbol of Morphosys). The Stock object contains over 80 fields which should be pretty self-explanatory.

To get a historical quote, use:

```
            List<HistoricalQuote> list = sdp.getHistoricalQuotes("MOR.DE", startDate, endDate, "d");
```

The forth parameter defines the interval, if quotes should be returned on a daily, weekly or monthly basis. 

That's pretty much it. 

Remarks
-------
I planned to add more data providers before releasing this but I guess since several years has already passed this won't be happening any time soon. If you find this somehow useful, drop me a line.

Licence
-------
   Copyright 2014 Joachim F. Rohde

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
