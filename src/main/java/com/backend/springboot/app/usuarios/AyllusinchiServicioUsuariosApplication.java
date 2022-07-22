package com.backend.springboot.app.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"com.backend.springboot.app.commons.usuarios.models.entity"})
@SpringBootApplication
public class AyllusinchiServicioUsuariosApplication {

    public static void main(String[] args) {
        SpringApplication.run(AyllusinchiServicioUsuariosApplication.class, args);
    }

}
