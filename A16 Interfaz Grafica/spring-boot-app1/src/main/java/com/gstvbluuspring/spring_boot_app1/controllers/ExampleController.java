package com.gstvbluuspring.spring_boot_app1.controllers;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.gstvbluuspring.spring_boot_app1.models.Employees;

@Controller
public class ExampleController {

    @GetMapping("/detalles_info")
    public String info(Model model) {
        // Para la captura del Video 12 prueba primero con null en dirección, luego cámbialo a "Calle Primera No. 1"
        Employees empleado1 = new Employees("Elon", "Musk", null, "Gerente", 21, 123456789, 1);
        model.addAttribute("empleado", empleado1);
        return "vista_empleados";
    }

    @ModelAttribute("empleados")
    public List<Employees> listaEmpleados() {
        return Arrays.asList(
            new Employees("Leonel", "Guadarrama", "Av Mario Colín", "Contador", 24, 551234567, 2),
            new Employees("Hidalgo", "Lopez", "Av. Reforma", "Analista", 29, 559876543, 3),
            new Employees("Ana", "Martinez", "Calle 5 No. 8", "Desarrolladora", 27, 554567890, 4)
        );
    }
}