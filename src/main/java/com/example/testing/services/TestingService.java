package com.example.testing.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.h2.H2ConsoleProperties;
import org.springframework.boot.autoconfigure.jdbc.JdbcProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestingService {

    private RestTemplate restTemplate;

    private H2ConsoleProperties h2ConsoleProperties;

    // Annotation based DI
    @Autowired
    private JdbcProperties jdbcProperties;

    // Constructor based DI
    public TestingService(RestTemplate restTemplate, H2ConsoleProperties h2ConsoleProperties) {
        this.restTemplate = restTemplate;
        this.h2ConsoleProperties = h2ConsoleProperties;
    }

    // Dependency injection using constructor
}
