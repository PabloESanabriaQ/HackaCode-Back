package com.codecrafters.hackacode.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codecrafters.hackacode.models.Cliente;
import org.springframework.stereotype.Repository;


@Repository
public interface IClienteRepository extends CrudRepository<Cliente,Long>{
    
}
