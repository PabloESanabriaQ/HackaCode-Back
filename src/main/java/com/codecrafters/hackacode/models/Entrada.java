package com.codecrafters.hackacode.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "entradas")
public class Entrada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entrada")
    private long idEntrada;
    private String codigo;
    private Long precio;
    @ManyToMany(targetEntity = Juego.class)
    private List<Juego> juego;
    @ManyToOne()
    private Cliente cliente;
    private LocalDateTime horarioDelJuego;
    @OneToOne
    private Venta venta;

}
