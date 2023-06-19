package com.codecrafters.hackacode.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codecrafters.hackacode.models.Usuario;
import com.codecrafters.hackacode.services.UsuarioService;

@RestController("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    
    @GetMapping("/")
    public ArrayList<Usuario> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @GetMapping("/{idUsuario}")
    public Usuario obtenerUsuario(Long idUsuario){
        return usuarioService.obtenerUsuarioPorId(idUsuario).get();
    }

    @PostMapping("/")
    public Usuario guardarUsuario(Usuario usuario){
        return usuarioService.guardarUsuario(usuario);
    }

    @DeleteMapping("/{idUsuario}")
    public boolean eliminarUsuario(Long idUsuario){
        return usuarioService.eliminarUsuario(idUsuario);
    }

    @PutMapping("/")
    public Usuario modificarUsuario(Usuario usuario){
        return usuarioService.modificarUsuario(usuario);
    }
}
