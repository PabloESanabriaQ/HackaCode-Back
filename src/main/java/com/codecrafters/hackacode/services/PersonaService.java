package com.codecrafters.hackacode.services;

import com.codecrafters.hackacode.models.Persona;
import com.codecrafters.hackacode.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PersonaService {
    @Autowired
    PersonaRepository personaRepository;
    public ArrayList<Persona> obtenerPersonas(){
        return (ArrayList<Persona>) personaRepository.findAll();
    }

    public Persona guardarPersona(Persona persona){
        return personaRepository.save(persona);
    }
}
