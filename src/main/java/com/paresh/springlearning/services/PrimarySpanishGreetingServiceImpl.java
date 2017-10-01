package com.paresh.springlearning.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
//Even if we have 2 primary service beans spring will not take into consideration because the profile es is not used anywhere
//if the profile is activated in application.properties then this primary bean service will be used
@Primary
public class PrimarySpanishGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Servicio de Saludo Primario";
    }
}
