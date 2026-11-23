package com.example.libreria.RepositoryLibrary;

import java.util.List;
import java.util.Optional;
import com.example.libreria.model.Books;

public interface IRepoLibros {
    List<Books> findAll();
    Optional<Books> findById(Long id);
    void save(Books libro);
    void deleteById(Long id);
}