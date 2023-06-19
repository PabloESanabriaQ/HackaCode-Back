package com.codecrafters.hackacode.repositories;

import com.codecrafters.hackacode.models.Empleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IEmpleadoRepository extends CrudRepository<Empleado,Long> {

}
