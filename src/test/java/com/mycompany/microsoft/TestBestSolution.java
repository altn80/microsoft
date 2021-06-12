/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.microsoft;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author andre
 */
public class TestBestSolution {

    @Test
    public void test1() {
        List<Stock> stocks = new ArrayList();
        Stock stock1 = new Stock("MSFT", 10, 20);
        Stock stock2 = new Stock("ABC", 10, 15);
        Stock stock3 = new Stock("T", 20, 30);
        stocks.add(stock1);
        stocks.add(stock2);
        stocks.add(stock3);
        List<Trade> testResult = new ArrayList();
        testResult.add(new Trade(stock1.ticker, stock2.ticker));
        testResult.add(new Trade(stock2.ticker, stock3.ticker));

        List<Trade> result = BestSolution.profitableTrades(stocks, 15);
        Assert.assertEquals(testResult.size(), result.size());
        Assert.assertEquals(testResult.get(0), result.get(0));
        Assert.assertEquals(testResult.get(1), result.get(1));

    }

    @Test
    public void test2() {
        List<Stock> stocks = new ArrayList();
        Stock stock1 = new Stock("X", 1, 5);
        Stock stock2 = new Stock("Y", 3, 4);
        Stock stock3 = new Stock("Z", 5, 4);
        Stock stock4 = new Stock("W", 100, 102);
        stocks.add(stock1);
        stocks.add(stock2);
        stocks.add(stock3);
        stocks.add(stock4);
        List<Trade> testResult = new ArrayList();
        testResult.add(new Trade(stock1.ticker, stock3.ticker));
        testResult.add(new Trade(stock2.ticker, stock4.ticker));
        List<Trade> result = BestSolution.profitableTrades(stocks, 3);
        Assert.assertEquals(testResult.size(), result.size());
        Assert.assertEquals(testResult.get(0), result.get(0));
        Assert.assertEquals(testResult.get(1), result.get(1));
    }

}
