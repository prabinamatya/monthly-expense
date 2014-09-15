package com.prabin.coding.config;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.prabin.coding.entities")
public class Appconfig {
	@PostConstruct
	public void doSomething() {
		System.out.println("Done from App Config side");
	}
}
