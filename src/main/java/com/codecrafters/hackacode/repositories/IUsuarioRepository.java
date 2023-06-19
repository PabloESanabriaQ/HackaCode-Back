package com.codecrafters.hackacode.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codecrafters.hackacode.models.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends CrudRepository<Usuario,Long>{
    
}
