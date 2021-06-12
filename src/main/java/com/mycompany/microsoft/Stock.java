/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.microsoft;

import java.util.Objects;

/**
 *
 * @author andre
 */
public class Stock {

    String ticker;
    Integer openingPrice;
    Integer closingPrice;

    public Stock(String ticker, Integer openingPrice, Integer closingPrice) {
        this.ticker = ticker;
        this.openingPrice = openingPrice;
        this.closingPrice = closingPrice;
    }

    public Integer getProfit() {
        return closingPrice - openingPrice;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.ticker);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Stock other = (Stock) obj;
        if (!Objects.equals(this.ticker, other.ticker)) {
            return false;
        }
        return true;
    }
    
}
