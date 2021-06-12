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
public class Trade {

    String stock1;
    String stock2;

    public Trade(String stock1, String stock2) {
        this.stock1 = stock1;
        this.stock2 = stock2;
    }

    @Override
    public boolean equals(Object obj) {
        return (stock1.equals(((Trade) obj).stock1) && stock2.equals(((Trade) obj).stock2))
                || (stock1.equals(((Trade) obj).stock2) && stock2.equals(((Trade) obj).stock1));
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.stock1) + Objects.hashCode(this.stock2);
        return hash;
    }

}