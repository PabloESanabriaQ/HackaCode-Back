package com.codecrafters.hackacode.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "empleados")
public class Empleado extends Persona {

    private boolean activo;

    @ManyToOne
    private Usuario usuario;

}
