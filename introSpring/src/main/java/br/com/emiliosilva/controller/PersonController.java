package br.com.emiliosilva.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.emiliosilva.model.Person;

@RestController
@RequestMapping("/person")
public class PersonController {
	private List<Person> listOfPersons = new ArrayList<Person>();
	
	PersonController() {
		listOfPersons.add(
				new Person("Emílio","Silva","03/03/2006","emiliosilva@gmail.com")
		);
		listOfPersons.add(
				new Person("Jueci","Costa","21/03/1962","juecicosta@gmail.com")
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
	
	@PostMapping
	public Map<String, String> insert(@RequestBody Person person) {
		Map<String,String> result = new HashMap<String,String>();
		boolean isSuccess = listOfPersons.add(person);
		if(isSuccess) {
			result.put("result", "Pessoa cadastrada com sucesso!!!");
		}else {
			result.put("result", "Não foi possível cadastrar a pessoa!!!");
		}
		return result;
	}
	
	@PutMapping
	public Map<String,String> edit(@RequestBody Person person) {
		Map<String,String> result = new HashMap<String,String>();
		
		for(Person element: listOfPersons) {
			if(element.getName().equalsIgnoreCase(person.getName())) {
				int index = listOfPersons.indexOf(element);
				listOfPersons.set(index, person);
				result.put("result", "Pessoa editada com sucesso!!!");
				return result;
			}
		}
		result.put("result", "Não foi possível editar a pessoa!!!");
		return result;
	}
	
	@DeleteMapping
	public Map<String,String> remove(@PathVariable String name) {
		Map<String,String> result = new HashMap<String,String>();
		boolean isSuccess = listOfPersons.removeIf(
				(person)->person.getName().equalsIgnoreCase(name)
		);
		if(isSuccess) {
			result.put("result", "Pessoa removida com sucesso!!!");
		}else {
			result.put("result", "Não foi possível remover a pessoa!!!");
		}
		return result;
	} 
}
