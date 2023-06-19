package com.codecrafters.hackacode.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import com.codecrafters.hackacode.models.Cliente;
import com.codecrafters.hackacode.repositories.IClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    
    @Autowired
    IClienteRepository clienteRepository;

    public ArrayList<Cliente> obtenerClientes(){
        return (ArrayList<Cliente>) clienteRepository.findAll();
    }

    public Cliente obtenerClientePorId(Long id){
        return clienteRepository.findById(id).get();
    }

    public Cliente guardarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }
    
    public boolean eliminarCliente(Long idCliente){
        try {
            clienteRepository.deleteById(idCliente);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public Cliente modificarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }
}
