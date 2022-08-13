package com.mavenweb.test.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	@Autowired
	private Person person;
	
	public String getName() {
		return person.getName();
	}
}
