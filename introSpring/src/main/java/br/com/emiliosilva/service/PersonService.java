package br.com.emiliosilva.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.emiliosilva.model.Person;

@Service
public class PersonService {
	private List<Person> listOfPersons = new ArrayList<Person>();
	
	PersonService() {
		listOfPersons.add(
				new Person("Emílio","Silva","03/03/2006","emiliosilva@gmail.com")
		);
		listOfPersons.add(
				new Person("João","Silva","22/06/1980","joao.silva@gmail.com")
		);
	}
	
	public List<Person> findAll() {
		return this.listOfPersons;
	}
	
	public Person findOne(String name) {
		for(Person person : listOfPersons) {
			if(person.getName().equalsIgnoreCase(name)) {
				return person;
			}
		}
		return null;
	}
	
	public Map<String, String> insert(Person person) {
		Map<String,String> result = new HashMap<String,String>();
		boolean isSuccess = listOfPersons.add(person);
		if(isSuccess) {
			result.put("result", "Pessoa cadastrada com sucesso!!!");
		}else {
			result.put("result", "Não foi possível cadastrar a pessoa!!!");
		}
		return result;
	}
	
	public Map<String, String> edit(Person person) {
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
	
	public Map<String,String> remove(String name) {
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
