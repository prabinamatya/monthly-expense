package com.prabin.coding;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.prabin.coding.config.Appconfig;
import com.prabin.coding.entities.Address;
import com.prabin.coding.entities.Person;

public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(Appconfig.class);
		ctx.refresh();
		
		Person person = ctx.getBean(Person.class);
		person.speak();
		
		Address address = ctx.getBean(Address.class);
		System.out.println(address);
		
		System.out.println(person);
		
		ctx.close();
	}

}
