package com.codecrafters.hackacode.services;

import com.codecrafters.hackacode.models.Empleado;
import com.codecrafters.hackacode.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class EmpleadoService {
    @Autowired
    EmpleadoRepository empleadoRepository;

    public ArrayList<Empleado> obtenerEmpleados() {
        return (ArrayList<Empleado>) empleadoRepository.findAll();
    }

    public Optional<Empleado> obtenerEmpleadoPorId(Long id) {
        return empleadoRepository.findById(id);
    }

    public Empleado guardarEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    public Boolean borrarEmpleado(Empleado empleado) {
        try {
            empleadoRepository.delete(empleado);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public Empleado modificarEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

}
