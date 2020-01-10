package com.vkakarla.springboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vkakarla.springboot.demo.model.Person;
import com.vkakarla.springboot.demo.serviceImpl.PersonService;

@RestController
public class PersonController {

	@Autowired
	PersonService personService;

	@RequestMapping(value = "/person-management/person/{personId}", method = RequestMethod.GET)
	public ResponseEntity<Object> getPersonByPersonId(@PathVariable String personId) {

		Person person = null;
		person = personService.getPersonByPersonId(personId);
		return new ResponseEntity<Object>(person, HttpStatus.OK);

	}

	//From Spring 5
	@GetMapping(value = "/person-management/persons")
	public ResponseEntity<Object> getPersons() {

		List<Person> pList = null;
		pList = personService.getPersons();
		return new ResponseEntity<Object>(pList, HttpStatus.OK);

	}

}
