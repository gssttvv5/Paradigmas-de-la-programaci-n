package com.gstvbluuspring.spring_boot_app1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gstvbluuspring.spring_boot_app1.models.dto.ClassDTO;

@RestController
@RequestMapping("/api")
public class ExampleRestController {

    @GetMapping("/detalles_info2")
    public ClassDTO detallesInfo2() {
        ClassDTO usuario1 = new ClassDTO();
        usuario1.setTitulo("Administrador");
        usuario1.setUsuario("InformaticConfig");
        return usuario1;
    }
}