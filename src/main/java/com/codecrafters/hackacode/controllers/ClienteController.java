package com.codecrafters.hackacode.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.codecrafters.hackacode.models.Cliente;
import com.codecrafters.hackacode.services.ClienteService;

@RestController()
@RequestMapping(value = "/api/clientes")
@PreAuthorize("hasRole('ADMINISTRADOR')")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ArrayList<Cliente> obtenerClientes(){
        return clienteService.obtenerClientes();
    }

    @GetMapping("/{idCliente}")
    public Cliente obtenerCliente(@PathVariable Long idCliente){
        return clienteService.obtenerClientePorId(idCliente);
    }

    @PostMapping
    public Cliente guardarCliente(Cliente cliente){
        return clienteService.guardarCliente(cliente);
    }

    @DeleteMapping("/{idCliente}")
    public boolean eliminarCliente(@PathVariable Long idCliente){
        return clienteService.eliminarCliente(idCliente);
    }

    @PutMapping
    public Cliente modificarCliente(Cliente cliente){
        return clienteService.modificarCliente(cliente);
    }
}
