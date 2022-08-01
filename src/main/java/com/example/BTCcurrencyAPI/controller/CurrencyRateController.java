package com.example.BTCcurrencyAPI.controller;

import com.example.BTCcurrencyAPI.model.CurrencyRate;
import com.example.BTCcurrencyAPI.service.CurrencyRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class CurrencyRateController {

    @Autowired
    private CurrencyRateService currencyRateService;

    @GetMapping("/currencyRate")
    public CurrencyRate getCurrencyRate() throws IOException {
        return currencyRateService.getCurrencyRate();

    }
}
