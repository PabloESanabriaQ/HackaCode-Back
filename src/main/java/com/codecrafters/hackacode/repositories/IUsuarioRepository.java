package com.codecrafters.hackacode.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.codecrafters.hackacode.models.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends CrudRepository<Usuario,Long>{
    Optional<Usuario> findByEmailUsuario(String emailUsuario);
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
}
