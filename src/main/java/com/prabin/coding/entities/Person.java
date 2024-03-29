package com.prabin.coding.entities;

import org.springframework.stereotype.Component;

@Component
public class Person {
	
	private int id;
	private String name;
	private int taxId;
	private Address address;

	public void speak() {
		System.out.println("Hello! I'm a person.");
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId
				+ ", address=" + address + "]";
	}

	
}
