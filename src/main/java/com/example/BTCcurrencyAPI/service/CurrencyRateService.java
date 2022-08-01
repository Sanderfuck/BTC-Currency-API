package com.example.BTCcurrencyAPI.service;

import com.example.BTCcurrencyAPI.model.CurrencyRate;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;

@Service
public class CurrencyRateService {
    public CurrencyRate getCurrencyRate() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new URL("https://api.binance.com/api/v3/ticker/price?symbol=BTCUAH"), CurrencyRate.class);
    }
}
