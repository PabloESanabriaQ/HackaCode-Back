package com.codecrafters.hackacode.service;

import com.codecrafters.hackacode.models.Usuario;
import com.codecrafters.hackacode.repositories.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    IUsuarioRepository IusuarioRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = IusuarioRepository.findByNombreUsuario(username)
                .orElseThrow(() -> new UsernameNotFoundException("El usuario " + username + "no existe"));
        Collection<? extends GrantedAuthority> authorities = usuario.getRoles()
                .stream().map(role -> new SimpleGrantedAuthority("ROLE_".concat(role.getName().name())))
                .collect(Collectors.toSet());

        return new User(usuario.getNombreUsuario(),
                usuario.getContrasenia(),
                true,
                true,
                true,
                true,
                authorities);
    }
}
