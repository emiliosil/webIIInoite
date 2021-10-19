package br.com.emiliosilva.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.emiliosilva.model.OnePiece;

@Repository
public interface OnePieceRepository extends CrudRepository<OnePiece, Integer> {

}
