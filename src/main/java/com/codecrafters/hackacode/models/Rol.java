package com.codecrafters.hackacode.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "roles")
public class Rol {
    
    @Id
    @Getter @Setter @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_rol")
    private Long idRol;

    @Getter @Setter
    private String descripcion;
}
