package br.com.emiliosilva.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.emiliosilva.model.Book;
import br.com.emiliosilva.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
	@Autowired
	private BookService bookService;

	@PostMapping
	public Book insert(@RequestBody Book book) {
		try {
		return bookService.insertOrUpdate(book);
	}catch (Exception e) {
		return null;
		}
	}
	
	@PutMapping
	public Book update(@RequestBody Book book) {
		return bookService.insertOrUpdate(book);
	}
	
	@GetMapping
	public List<Book> findAll() {
		return bookService.findAll();
	}
	
	@GetMapping("{/id}")
	public Optional<Book> findOne(@PathVariable int id) {
		return bookService.findOne(id);
	}
	
	@DeleteMapping("/{id}")
	public void remove(@PathVariable int id) {
		bookService.remove(id);
	}
}
