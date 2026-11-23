package com.example.libreria.util;

import org.springframework.stereotype.Component;
import com.example.libreria.model.Books;

@Component
public class ValidaLibros {
    public boolean tituloValido(Books libro) {
        return libro != null && libro.getTitulo() != null && !libro.getTitulo().isBlank();
    }
}