package com.codecrafters.hackacode.services;

import com.codecrafters.hackacode.models.Venta;
import com.codecrafters.hackacode.repositories.IVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class VentaService {
    @Autowired
    IVentaRepository ventaRepository;

    public ArrayList<Venta> obtenerVentas(){
        return (ArrayList<Venta>) ventaRepository.findAll();
    }

    public Optional<Venta> obtenerVentaPorId(Long id){
        return ventaRepository.findById(id);
    }

    public Venta guardarVenta(Venta venta){
        return ventaRepository.save(venta);
    }

    public boolean eliminarVenta(Long id){
        try {
            ventaRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Venta modificarVenta(Venta venta){
        return ventaRepository.save(venta);
    }




}
