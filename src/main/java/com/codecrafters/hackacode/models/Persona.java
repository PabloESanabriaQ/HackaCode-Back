package com.codecrafters.hackacode.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "personas")
public class Persona {
    @Id
    @Getter @Setter @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Getter @Setter
    private String nombre;
    
    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Persona() {
    }

}
