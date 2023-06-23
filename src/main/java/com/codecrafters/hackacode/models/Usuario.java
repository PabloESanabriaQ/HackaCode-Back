package com.codecrafters.hackacode.models;

import java.util.Set;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name= "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private Long idUsuario;

    @Column(name="email_usuario")
    private String emailUsuario;

    @Column(name="nombre_usuario")
    private String nombreUsuario;
    
    private String contrasenia;

    @ManyToMany(fetch = FetchType.EAGER, targetEntity = Rol.class, cascade = CascadeType.PERSIST)
    @JoinTable(name = "usuarios_roles", joinColumns = @JoinColumn(name = "id_usuario"), inverseJoinColumns = @JoinColumn(name = "id_rol"))
    private Set<Rol> roles;
}
