package com.gstvbluuspring.spring_boot_app1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gstvbluuspring.spring_boot_app1.models.dto.ParameterDTO;

@RestController
@RequestMapping("/api/parametros")
public class RequestParamControllers {

    @GetMapping("/detalle")
    public ParameterDTO detalle(
            @RequestParam(required = false, defaultValue = "Hola a todos, esta es una prueba de que funciona correctamente jejej") String informacion) {
        ParameterDTO parametro1 = new ParameterDTO();
        parametro1.setInformacion(informacion);
        return parametro1;
    }
}