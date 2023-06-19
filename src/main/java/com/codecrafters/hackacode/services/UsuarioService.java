package com.codecrafters.hackacode.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.codecrafters.hackacode.models.Usuario;
import com.codecrafters.hackacode.repositories.IUsuarioRepository;

public class UsuarioService {
    
    @Autowired
    IUsuarioRepository usuarioRepository;

    public ArrayList<Usuario> obtenerUsuarios(){
        return (ArrayList<Usuario>) usuarioRepository.findAll();
    }

    public Optional<Usuario> obtenerUsuarioPorId(Long id){
        return usuarioRepository.findById(id);
    }

    public Usuario guardarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public boolean eliminarUsuario(Long id){
        try {
            usuarioRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public Usuario modificarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

}
