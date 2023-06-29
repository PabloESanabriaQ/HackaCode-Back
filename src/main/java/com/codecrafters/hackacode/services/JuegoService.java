package com.codecrafters.hackacode.services;

import com.codecrafters.hackacode.models.Juego;
import com.codecrafters.hackacode.repositories.IJuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class JuegoService {
    @Autowired
    IJuegoRepository juegoRepository;

    public ArrayList<Juego> obtenerJuegos(){
        return (ArrayList<Juego>) juegoRepository.findAll();
    }

    public Optional<Juego> obtenerJuegoPorId(Long id){
        return juegoRepository.findById(id);
    }

    public Juego guardarJuego(Juego juego){
        return juegoRepository.save(juego);
    }

    public boolean eliminarJuego(Long id){
        try {
            juegoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Juego modificarJuego(Juego juego){
        return juegoRepository.save(juego);
    }




}
