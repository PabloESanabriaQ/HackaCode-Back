package com.codecrafters.hackacode.repositories;

import com.codecrafters.hackacode.models.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends CrudRepository<Persona,Long> {

}
