package com.prabin.coding.entities;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String street;
	private String postcode;
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", postcode=" + postcode + "]";
	}
	
	
}
