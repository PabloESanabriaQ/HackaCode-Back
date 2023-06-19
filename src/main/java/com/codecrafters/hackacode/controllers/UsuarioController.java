package com.codecrafters.hackacode.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.codecrafters.hackacode.models.Usuario;
import com.codecrafters.hackacode.services.UsuarioService;

@RestController
@RequestMapping(value = "/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    
    @GetMapping
    public ArrayList<Usuario> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @GetMapping("/{idUsuario}")
    public Usuario obtenerUsuario(@PathVariable Long idUsuario){
        return usuarioService.obtenerUsuarioPorId(idUsuario).get();
    }

    @PostMapping
    public Usuario guardarUsuario(Usuario usuario){
        return usuarioService.guardarUsuario(usuario);
    }

    @DeleteMapping("/{idUsuario}")
    public boolean eliminarUsuario(@PathVariable Long idUsuario){
        return usuarioService.eliminarUsuario(idUsuario);
    }

    @PutMapping
    public Usuario modificarUsuario(Usuario usuario){
        return usuarioService.modificarUsuario(usuario);
    }
}
