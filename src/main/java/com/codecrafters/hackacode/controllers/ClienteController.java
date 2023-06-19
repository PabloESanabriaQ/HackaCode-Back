package com.codecrafters.hackacode.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codecrafters.hackacode.models.Cliente;
import com.codecrafters.hackacode.services.ClienteService;

@RestController("/api/clientes")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/")
    public ArrayList<Cliente> obtenerClientes(){
        return clienteService.obtenerClientes();
    }

    @GetMapping("/{idCliente}")
    public Cliente obtenerCliente(Long idCliente){
        return clienteService.obtenerClientePorId(idCliente);
    }

    @PostMapping("/")
    public Cliente guardarCliente(Cliente cliente){
        return clienteService.guardarCliente(cliente);
    }

    @DeleteMapping("/{idCliente}")
    public boolean eliminarCliente(Long idCliente){
        return clienteService.eliminarCliente(idCliente);
    }

    @PutMapping("/")
    public Cliente modificarCliente(Cliente cliente){
        return clienteService.modificarCliente(cliente);
    }
}
