package com.paresh.springlearning.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
//This annotation tells spring that if a controller is asking for a default bean then bean of this class should be wired
@Primary
@Profile({"en","default"})
public class PrimaryGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I am from Primary Service Implementation";
    }
}