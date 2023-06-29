package com.codecrafters.hackacode.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "juegos")
public class Juego {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank
    private String nombreJuego;
    @NotBlank
    private int capacidad;

    @OneToOne(targetEntity = Empleado.class)
    private Empleado empleado;

    @ManyToMany(targetEntity = Entrada.class)
    private Entrada entrada[];

    private LocalDateTime duracion;



}
