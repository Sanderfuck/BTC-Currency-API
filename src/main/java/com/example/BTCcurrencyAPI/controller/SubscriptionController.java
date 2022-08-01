package com.example.BTCcurrencyAPI.controller;


import com.example.BTCcurrencyAPI.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscriptionController {

    @Autowired
    private SubscriptionService subscriptionService;

    @PostMapping
    public void saveSubscription(String mail) {
        subscriptionService.save(mail);
    }
}
