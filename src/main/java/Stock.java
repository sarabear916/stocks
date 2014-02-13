package main.java;

import java.util.ArrayList;

/**
 * Created by aconniff, sgerstrung and jtolla on 2/12/14.
 */
public class Stock {

    private String tickerSymbol;

    public Stock(String tickerSymbol) {

        this.tickerSymbol = tickerSymbol;

    }

    public String getTickerSymbol() {

        return tickerSymbol;
    }

    /**
     * This method screen scrapes finance.yahoo.com for data
     * associated with the provided ticker symbol.
     */
    public void getStockData() {

    }

    /**
     * This method returns
     *
     * @return
     */
    public Integer getCurrentPrice() { return 0; }

}
