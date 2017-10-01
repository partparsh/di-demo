package com.paresh.springlearning.controllers;

import com.paresh.springlearning.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//here we tell spring that this class is a bean and spring will instantiate an object of this class during run time and this object resides in application context
@Controller
public class HelloWorldController {

    private GreetingService greetingService;

    @Autowired
    public HelloWorldController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }





    public String hello(){
        System.out.println("Hello World, i reside in application context");
        return greetingService.sayGreeting();
    }

}
