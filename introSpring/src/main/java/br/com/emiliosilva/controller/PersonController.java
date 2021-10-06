package br.com.emiliosilva.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.emiliosilva.model.Person;

@RestController
@RequestMapping("/person")
public class PersonController {
	private List<Person> listOfPersons = new ArrayList<Person>();
	
	PersonController() {
		listOfPersons.add(
				new Person("Emílio","Silva",LocalDate.of(2006, 3, 3),"emiliosilva@gmail.com")
		);
		listOfPersons.add(
				new Person("Jueci","Costa",LocalDate.of(1962, 3, 21),"juecicosta@gmail.com")
		);
	}
	
	@GetMapping
	public List<Person> findAll() {
		return listOfPersons;
	}
	
	@GetMapping("/{name}")
	public Person findOne(@PathVariable String name) {
		for(Person person : listOfPersons) {
			if(person.getName() == name) {
				return person;
			}
		}
		return null;
	}
	
}
