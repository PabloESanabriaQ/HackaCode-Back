package com.codecrafters.hackacode.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "empleados")
public class Empleado extends Persona {
    @Id
    @Getter @Setter
    private long idEmpleado;
    Usuario usuario;

    public Empleado(long id, String nombre, String apellido, int dni, String email, long telefono, Usuario usuario) {
        super(id, nombre, apellido, dni, email, telefono);
        this.usuario = usuario;
    }

    public Empleado(Usuario usuario) {
        this.usuario = usuario;
    }

}
