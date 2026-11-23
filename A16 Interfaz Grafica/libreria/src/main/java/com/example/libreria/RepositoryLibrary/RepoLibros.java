package com.example.libreria.RepositoryLibrary;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import com.example.libreria.model.Books;

@Repository
public class RepoLibros implements IRepoLibros {

    private final List<Books> libros = new ArrayList<>();

    public RepoLibros() {
        libros.add(new Books(1L, "Miguel de Cervantes", "El Quijote", LocalDate.of(1605, 1, 16)));
        libros.add(new Books(2L, "Gabriel Garcia Marquez", "Cien Anos de Soledad", LocalDate.of(1967, 5, 30)));
        libros.add(new Books(3L, "J.K. Rowling", "Harry Potter y la Piedra Filosofal", LocalDate.of(1997, 6, 26)));
        libros.add(new Books(4L, "George Orwell", "1984", LocalDate.of(1949, 6, 8)));
    }

    @Override
    public List<Books> findAll() {
        return libros;
    }

    @Override
    public Optional<Books> findById(Long id) {
        return libros.stream()
                .filter(libro -> libro.getIdLibro() == id)
                .findFirst();
    }

    @Override
    public void save(Books libro) {
        findById(libro.getIdLibro()).ifPresent(libros::remove);
        libros.add(libro);
    }

    @Override
    public void deleteById(Long id) {
        findById(id).ifPresent(libros::remove);
    }
}