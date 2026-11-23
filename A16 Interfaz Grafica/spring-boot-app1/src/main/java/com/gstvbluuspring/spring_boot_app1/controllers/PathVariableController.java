package com.gstvbluuspring.spring_boot_app1.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gstvbluuspring.spring_boot_app1.models.Employees;
import com.gstvbluuspring.spring_boot_app1.models.dto.ParameterDTO;

@RestController
@RequestMapping("/api/variable")
public class PathVariableController {

    @Value("${config.usuario}")
    private String usuario;

    @Value("${config.codigo}")
    private int codigo;

    @Value("${config.mensaje}")
    private String mensaje;

    @Value("${config.valores}")
    private String[] valores;

    // Video 15: @PathVariable
    @GetMapping("/pagina1/{mensaje}")
    public ParameterDTO pagina1(@PathVariable String mensaje) {
        ParameterDTO parametro1 = new ParameterDTO();
        parametro1.setInformacion(mensaje);
        return parametro1;
    }

    // Video 16: POST con @RequestBody (probar en Postman)
    @PostMapping("/solicitud")
    public Employees creaEmple(@RequestBody Employees empleado1) {
        return empleado1;
    }

    // Video 17: @Value desde application.properties
    @GetMapping("/valores")
    public Map<String, Object> values() {
        Map<String, Object> json = new HashMap<>();
        json.put("usuario", usuario);
        json.put("codigo", codigo);
        json.put("mensaje", mensaje);
        json.put("valores", valores);
        return json;
    }
}