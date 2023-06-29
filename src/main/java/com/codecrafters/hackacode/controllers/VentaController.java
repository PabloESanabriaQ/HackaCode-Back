package com.codecrafters.hackacode.controllers;

import com.codecrafters.hackacode.models.Juego;
import com.codecrafters.hackacode.models.Venta;
import com.codecrafters.hackacode.services.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api/ventas")
@PreAuthorize("hasRole('JUEGO')")
public class VentaController {

    @Autowired
    VentaService ventaService;
    @GetMapping
    public ArrayList<Venta> obtenerVentas(){
        return ventaService.obtenerVentas();
    }
    @GetMapping("/{id}")
    public Optional<Venta> obtenerVentaPorId(Long id){
        return ventaService.obtenerVentaPorId(id);
    }
    @PostMapping
    public Venta guardarVenta(@RequestBody Venta venta) {
        return this.ventaService.guardarVenta(venta);
    }
    @DeleteMapping("/{idVenta}")
    public void borrarVenta(@PathVariable Long idVenta){
        this.ventaService.eliminarVenta(idVenta);
    }

    @PutMapping
    public Venta modificaJuego(@RequestBody Venta venta){
        return this.ventaService.modificarVenta(venta);
    }
}
