package com.example.libreria.Exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.stereotype.Service;

@Service
public class FileContent {
    public String lecturaArchivo(String ruta) {
        try {
            Path vRuta = Paths.get(ruta);
            return Files.readString(vRuta);
        } catch (IOException error) {
            throw new RuntimeException("Error en lectura de archivo: " + error.getMessage(), error);
        }
    }
}