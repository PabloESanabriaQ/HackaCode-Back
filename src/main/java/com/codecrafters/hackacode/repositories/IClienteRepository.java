package com.codecrafters.hackacode.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codecrafters.hackacode.models.Cliente;

public interface IClienteRepository extends CrudRepository<Cliente,Long>{
    
}
