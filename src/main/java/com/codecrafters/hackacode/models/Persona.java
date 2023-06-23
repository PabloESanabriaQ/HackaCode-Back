package com.codecrafters.hackacode.models;

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
@Table(name = "personas")
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    private String nombre;

    private String apellido;
    
    private int dni;

}
