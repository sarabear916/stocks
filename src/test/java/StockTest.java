package test.java;

import main.java.Stock;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by aconniff, sgerstrung and jtolla on 2/12/14.
 */
public class StockTest {

    private Stock stock;

    @Before
    public void setup() {
        stock = new Stock("TSLA");
    }

    @Test
    public void testStockConstructor() {
        assertEquals("stock constructor test", stock.getTickerSymbol(), "TSLA");
    }

    @Test
    public void testGetStockData() {

    }

    @Test
    public void testGetCurrentPrice() {

    }

}
