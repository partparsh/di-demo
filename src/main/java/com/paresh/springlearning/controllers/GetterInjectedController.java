package com.paresh.springlearning.controllers;

import com.paresh.springlearning.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GetterInjectedController {


    private GreetingService greetingService;
    //spring will create object of this class using the below setter
    @Autowired
    //Qualifier can be used to tell spring which service implementation to wire with this specific controller, the service bean name is camel case class name
    //Qualifier can be used in method level
    @Qualifier("getterGreetingServiceImpl")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
