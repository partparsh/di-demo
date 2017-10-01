package com.paresh.springlearning.controllers;

import com.paresh.springlearning.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    //spring will create object of this class using the below property
    @Autowired
    // we can also tell spring to use certain service implementation by providing service bean name not to use this
    // if there is primary service bean then that bean will be picked up even if we user specific bean name, we will need to add a qualifier then
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }


}
