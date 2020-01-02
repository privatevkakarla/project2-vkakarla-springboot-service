package com.vkakarla.springboot.demo.service;

import java.util.List;

import com.vkakarla.springboot.demo.model.Person;

public interface IPersonService {
	
	public Person getPersonByPersonId(String personId);
	
	public List<Person> getPersons();

}
