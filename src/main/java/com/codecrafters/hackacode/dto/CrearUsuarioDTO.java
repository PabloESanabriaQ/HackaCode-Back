package com.codecrafters.hackacode.dto;

import java.util.Set;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CrearUsuarioDTO {
    
    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String nombreUsuario;
    @NotBlank
    private String contrasenia;
    private Set<String> roles;
}
