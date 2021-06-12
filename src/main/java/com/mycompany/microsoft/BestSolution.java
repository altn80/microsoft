/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.microsoft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author andre
 */
public class BestSolution {

    public static List<Trade> profitableTrades(List<Stock> stocks, Integer desirableProfit) {
        Set<Trade> result = new HashSet<>();
        Map<Integer, List<Stock>> complements = new HashMap<>();
        for (Stock stock : stocks) {
            Integer complement = desirableProfit - stock.getProfit();
            if (complements.get(complement) == null) {
                complements.put(complement, new ArrayList<>());
            }
            complements.get(complement).add(stock);
        }
        for (Stock stock : stocks) {
            List<Stock> stocksToTrade = complements.get(stock.getProfit());
            List<Trade> trades = stocksToTrade.stream().map(stockToTrade -> new Trade(stock.ticker, stockToTrade.ticker)).collect(Collectors.toList());
            result.addAll(trades);
        }

        return new ArrayList<>(result);
    }

}
