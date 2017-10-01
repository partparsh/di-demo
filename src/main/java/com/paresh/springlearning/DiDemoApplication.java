package com.paresh.springlearning;

import com.paresh.springlearning.controllers.ConstructorInjectedController;
import com.paresh.springlearning.controllers.GetterInjectedController;
import com.paresh.springlearning.controllers.HelloWorldController;
import com.paresh.springlearning.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		//run method will return back an instance of application context
		ApplicationContext applicationContext=SpringApplication.run(DiDemoApplication.class, args);

		HelloWorldController helloWorldController = (HelloWorldController) applicationContext.getBean("helloWorldController");

		System.out.println(helloWorldController.hello());
		System.out.println(applicationContext.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(applicationContext.getBean(GetterInjectedController.class).sayHello());
		System.out.println(applicationContext.getBean(ConstructorInjectedController.class).sayHello());

	}
}
