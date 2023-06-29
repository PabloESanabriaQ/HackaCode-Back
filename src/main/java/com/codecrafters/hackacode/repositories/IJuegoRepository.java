package com.codecrafters.hackacode.repositories;

import com.codecrafters.hackacode.models.Juego;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJuegoRepository extends CrudRepository<Juego, Long> {


}
