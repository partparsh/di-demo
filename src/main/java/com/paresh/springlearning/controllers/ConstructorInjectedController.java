package com.paresh.springlearning.controllers;

import com.paresh.springlearning.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


//this tells the spring that this class is a constructor
@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;
    //spring will create object of this class using the below constructor
    //Qualifier can be used to tell spring which service implementation to wire with this specific controller, the service bean name is camel case class name
    //Qualifier can be used in parameter level
    public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
