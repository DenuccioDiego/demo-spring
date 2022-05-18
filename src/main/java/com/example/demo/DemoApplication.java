package com.example.demo;

import com.example.demo.configuration.DatabaseConfiguration;
import com.example.demo.services.UserService;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("start");
		// SpringApplication.run(DemoApplication.class, args);

		try (AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(DatabaseConfiguration.class)) {
			UserService userService = ctx.getBean(UserService.class);

			try {
				userService.findUsers();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
