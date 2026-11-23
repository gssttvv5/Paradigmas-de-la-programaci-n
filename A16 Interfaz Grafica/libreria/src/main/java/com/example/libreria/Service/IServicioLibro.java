package com.example.libreria.Service;

import java.util.List;
import java.util.Optional;
import com.example.libreria.model.Books;

public interface IServicioLibro {
    List<Books> obtenerTodos();
    Optional<Books> obtenerPorId(Long id);
    Books guardar(Books libro);
    void eliminarPorId(Long id);
    String buscaLibroPorTitulo(String titulo);
}