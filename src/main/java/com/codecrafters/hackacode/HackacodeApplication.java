package com.codecrafters.hackacode;
import com.codecrafters.hackacode.models.ERol;
import com.codecrafters.hackacode.models.Rol;
import com.codecrafters.hackacode.models.Usuario;
import com.codecrafters.hackacode.repositories.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Set;

@SpringBootApplication
public class HackacodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HackacodeApplication.class, args);
	}

}
