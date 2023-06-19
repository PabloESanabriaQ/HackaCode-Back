package com.codecrafters.hackacode.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "personas")
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona {
    @Id
    @Getter @Setter @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @Getter @Setter
    private String nombre;
    @Getter @Setter
    private String apellido;
    @Getter @Setter
    private int dni;
    @Getter @Setter
    private String email;
    @Getter @Setter
    private long telefono;

    public Persona(long id, String nombre, String apellido, int dni, String email, long telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
    }

    public Persona() {
    }

}
