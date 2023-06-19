package com.codecrafters.hackacode.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "entradas")
public class Entrada {
    @Id
    @Getter @Setter @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entrada")
    private long idEntrada;
    @Getter @Setter
    private String nombre;
}
