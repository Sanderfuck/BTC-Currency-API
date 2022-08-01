package com.example.BTCcurrencyAPI.service;


import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class SubscriptionService {

    @Value("${filepath}")
    private String filePathSTR;

    private Path filePath;

    private Set<String> subscriptions;

    @PostConstruct
    private void init() throws IOException {
        filePath = Path.of(filePathSTR);
        subscriptions = ConcurrentHashMap.newKeySet();
        if (Files.exists(filePath)) {
            subscriptions.addAll(Files.readAllLines(filePath));
        } else {
            Files.createFile(filePath);
        }
    }

    @SneakyThrows
    public void save(String subscription) {
        boolean added = subscriptions.add(subscription);
        if (added) {
            Files.writeString(filePath, subscription + "\n", StandardOpenOption.APPEND);
        }
    }

    public Set<String> getSubscriptions() {
        return new HashSet<>(subscriptions);
    }

}
