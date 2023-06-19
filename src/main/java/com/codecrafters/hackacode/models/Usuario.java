package com.codecrafters.hackacode.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "usuarios")
public class Usuario extends Persona{
    
    @Id
    @Getter @Setter @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private Long idUsuario;

    @Getter @Setter
    @Column(name="nombre_usuario")
    private String nombreUsuario;

    @Getter @Setter
    private String contrasenia;

    @Getter @Setter
    @ManyToOne
    private Rol rol;
}
