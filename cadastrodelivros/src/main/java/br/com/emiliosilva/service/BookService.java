package br.com.emiliosilva.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.emiliosilva.model.Book;
import br.com.emiliosilva.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	public Book insertOrUpdate(Book book) {
		return bookRepository.save(book);
	}
	
	public List<Book> findAll() {
		List<Book> books = new ArrayList<>();
		bookRepository.findAll().forEach(books::add);
		return books;
	}
	public Optional<Book> findOne(int id) {
		return bookRepository.findById(id);
	}
	public void remove(int id) {
		bookRepository.deleteById(id);
	}
}
