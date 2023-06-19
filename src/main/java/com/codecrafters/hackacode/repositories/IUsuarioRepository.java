package com.codecrafters.hackacode.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codecrafters.hackacode.models.Usuario;

public interface IUsuarioRepository extends CrudRepository<Usuario,Long>{
    
}
