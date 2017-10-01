package com.paresh.springlearning.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingServiceImpl implements GreetingService {
    public static final String HELLO_CONSTRUCTOR = "Hello I was injected by getter !!!";

    @Override
    public String sayGreeting() {
        return HELLO_CONSTRUCTOR;
    }

}
