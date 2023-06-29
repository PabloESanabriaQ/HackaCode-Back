package com.codecrafters.hackacode.controllers;

import com.codecrafters.hackacode.models.Empleado;
import com.codecrafters.hackacode.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController()
@RequestMapping(value = "/api/empleados")
@PreAuthorize("hasRole('ADMINISTRADOR')")
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping
    public ArrayList<Empleado> obtenerEmpleados(){
        return empleadoService.obtenerEmpleados();
    }
    @GetMapping("/{id}")
    public Optional<Empleado> obtenerEmpleadoPorId(Long id){
        return empleadoService.obtenerEmpleadoPorId(id);
    }
    @PostMapping
    public Empleado guardarEmpleado(@RequestBody Empleado empleado){
        return this.empleadoService.guardarEmpleado(empleado);
    }
    @DeleteMapping("/{idEmpleado}")
    public void borrarEmpleado(@PathVariable Long idEmpleado){
        this.empleadoService.borrarEmpleado(idEmpleado);
    }

    @PutMapping
    public Empleado modificaEmpleado(@RequestBody Empleado empleado){
        return this.empleadoService.modificarEmpleado(empleado);
    }

}
