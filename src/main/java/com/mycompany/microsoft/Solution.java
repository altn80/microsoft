/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.microsoft;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class Solution {

    public static List<Trade> profitableTrades(List<Stock> stocks, Integer P) {
        List<Trade> result = new ArrayList<>();
        for (int i = 0; i < stocks.size(); i++) {
            Stock stock1 = stocks.get(i);
            for (int j = i + 1; j < stocks.size(); j++) {
                Stock stock2 = stocks.get(j);
                if (stock1.getProfit() + stock2.getProfit() == P) {
                    result.add(new Trade(stock1.ticker, stock2.ticker));
                }
            }
        }
        return result;
    }
}
