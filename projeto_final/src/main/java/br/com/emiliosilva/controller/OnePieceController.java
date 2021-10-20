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

import br.com.emiliosilva.model.OnePiece;
import br.com.emiliosilva.service.OnePieceService;

@RestController
@RequestMapping("/onePieces")
public class OnePieceController {
	@Autowired
	private OnePieceService onePieceService;
	
	@PostMapping
	public OnePiece insert(@RequestBody OnePiece onePiece) {
			return onePieceService.insertOrUpdate(onePiece);
	}
	
	@PutMapping
	public OnePiece update(@RequestBody OnePiece onePiece) {
		return onePieceService.insertOrUpdate(onePiece);
	}
	
	@GetMapping
	public List<OnePiece> findAll() {
		return onePieceService.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<OnePiece> findOne(@PathVariable int id) {
		return onePieceService.findOne(id);
	}
	
	@DeleteMapping("/{id}")
	public void remove(@PathVariable int id) {
		onePieceService.remove(id);
	}
}
