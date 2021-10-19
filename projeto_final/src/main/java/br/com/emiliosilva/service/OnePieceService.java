package br.com.emiliosilva.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.emiliosilva.model.OnePiece;
import br.com.emiliosilva.repository.OnePieceRepository;

@Service
public class OnePieceService {
	@Autowired
	private OnePieceRepository onePieceRepository;
	
	public OnePiece insertOrUpdate(OnePiece onePiece) {
		return onePieceRepository.save(onePiece);
	}
	
	public List<OnePiece> findAll() {
		List<OnePiece> onePieces = new ArrayList<>();
		onePieceRepository.findAll().forEach(onePieces::add);
		return onePieces;
	}
	
	public Optional<OnePiece> findOne(int id) {
		return onePieceRepository.findById(id);
	}
	
	public void remove(int id) {
		onePieceRepository.deleteById(id);
	}
}
