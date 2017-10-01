package com.paresh.springlearning.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("de")
@Primary
public class PrimaryGermanGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "HALLO- GUTEN TAG GUTEN MORGEN";
    }
}
