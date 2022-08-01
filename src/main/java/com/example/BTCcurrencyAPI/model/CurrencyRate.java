package com.example.BTCcurrencyAPI.model;

import lombok.Data;

@Data
public class CurrencyRate {
    private String symbol;
    private double price;

    @Override
    public String toString() {
        return String.format("Rate currency exchange of %s is %f", symbol, price);
    }
}
