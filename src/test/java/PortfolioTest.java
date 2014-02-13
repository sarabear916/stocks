package test.java;

import main.java.Portfolio;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by aconniff, sgerstrung and jtolla on 2/12/14.
 */
public class PortfolioTest {

    private Portfolio portfolio;

    @Before
    public void setup() {
        portfolio = new Portfolio("My Portfolio");
    }

    @Test
    public void testPortfolioConstruction() {
        assertEquals("portfolio constructor test", portfolio.getPortfolioName(), "My Portfolio");
    }

    @Test
    public void testAddStock() {

    }

    @Test
    public void testRemoveStock() {

    }

    @Test
    public void testDisplayPortfolio() {

    }

}
