package com.codecrafters.hackacode.controllers;

import com.codecrafters.hackacode.models.Juego;
import com.codecrafters.hackacode.services.JuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/juegos")
@PreAuthorize("hasRole('JUEGO')")
public class JuegoController {
    @Autowired
    private JuegoService juegoService;
    @GetMapping
    public ArrayList<Juego> obtenerJuegos(){
        return juegoService.obtenerJuegos();
    }
    @GetMapping("/{id}")
    public Optional<Juego> obtenerJuegoPorId(Long id){
        return juegoService.obtenerJuegoPorId(id);
    }
    @PostMapping
    public Juego guardarJuego(@RequestBody Juego juego){
        return this.juegoService.guardarJuego(juego);
    }
    @DeleteMapping("/{idJuego}")
    public void borrarJuego(@PathVariable Long idJuego){
        this.juegoService.eliminarJuego(idJuego);
    }

    @PutMapping
    public Juego modificaJuego(@RequestBody Juego juego){
        return this.juegoService.modificarJuego(juego);
    }

}
