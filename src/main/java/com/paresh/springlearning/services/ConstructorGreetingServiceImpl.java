package com.paresh.springlearning.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {
    public static final String HELLO_CONSTRUCTOR = "Hello I was injected by constructor !!!";

    @Override
    public String sayGreeting() {
        return HELLO_CONSTRUCTOR;
    }
}
