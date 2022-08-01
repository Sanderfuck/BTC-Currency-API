package com.example.BTCcurrencyAPI.service;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@Component
@RequiredArgsConstructor
@EnableScheduling
public class EmailService {

    private final SubscriptionService subscriptionService;
    private final JavaMailSender emailSender;
    private final CurrencyRateService currencyRateService;

    @Scheduled(fixedRate = 1, initialDelay = 1, timeUnit = TimeUnit.HOURS)
    public void sendSimpleMessage() throws IOException {
        String text = currencyRateService.getCurrencyRate().toString();

        Set<String> subscriptions = subscriptionService.getSubscriptions();
        subscriptions.forEach(mail -> {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("alexkapusniak@gmaal.com");
            message.setTo(mail);
            message.setSubject("Currency Rate of BTC/UAH");
            message.setText(text);
            emailSender.send(message);
        });
    }
}