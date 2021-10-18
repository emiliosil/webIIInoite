package br.com.emiliosilva.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.emiliosilva.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
	
}
