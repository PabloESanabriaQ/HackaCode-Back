package com.codecrafters.hackacode.controllers;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.codecrafters.hackacode.dto.CrearUsuarioDTO;
import com.codecrafters.hackacode.models.ERol;
import com.codecrafters.hackacode.models.Rol;
import com.codecrafters.hackacode.models.Usuario;
import com.codecrafters.hackacode.services.UsuarioService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api/usuarios")
@PreAuthorize("hasRole('ADMINISTRADOR')")
public class UsuarioController {
    PasswordEncoder passwordEncoder;
    @Autowired
    private UsuarioService usuarioService;
    
    @GetMapping
    public ArrayList<Usuario> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @GetMapping("/{idUsuario}")
    public Usuario obtenerUsuario(@PathVariable String idUsuario){
        return usuarioService.obtenerUsuarioPorId(Long.parseLong(idUsuario)).get();
    }

    @PostMapping
    public ResponseEntity<Usuario> guardarUsuario(@Valid @RequestBody CrearUsuarioDTO usuario){

        Set<Rol> roles = usuario.getRoles().stream()
                .map(rol -> Rol.builder()
                .name(ERol.valueOf(rol))
                .build()
                ).collect(Collectors.toSet());

        Usuario usuarioGuardado = Usuario.builder()
                .nombreUsuario(usuario.getNombreUsuario())
                .emailUsuario(usuario.getEmail())
                .contrasenia(passwordEncoder.encode(usuario.getContrasenia()))
                .roles(roles)
                .build();
        
        usuarioService.guardarUsuario(usuarioGuardado);

        return ResponseEntity.ok(usuarioGuardado);
    }

    @DeleteMapping("/{idUsuario}")
    public boolean eliminarUsuario(@PathVariable String idUsuario){
        return usuarioService.eliminarUsuario(Long.parseLong(idUsuario));
    }

    @PutMapping
    public Usuario modificarUsuario(@Valid @RequestBody Usuario usuario){
        return usuarioService.modificarUsuario(usuario);
    }
}
