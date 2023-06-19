package com.codecrafters.hackacode.services;

import com.codecrafters.hackacode.models.Empleado;
import com.codecrafters.hackacode.repositories.IEmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class EmpleadoService {
    @Autowired
    IEmpleadoRepository empleadoRepository;

    public ArrayList<Empleado> obtenerEmpleados() {
        return (ArrayList<Empleado>) empleadoRepository.findAll();
    }

    public Optional<Empleado> obtenerEmpleadoPorId(Long id) {
        return empleadoRepository.findById(id);
    }

    public Empleado guardarEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    public Boolean borrarEmpleado(Long idEmpleado) {
        try {
            empleadoRepository.deleteById(idEmpleado);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public Empleado modificarEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

}
