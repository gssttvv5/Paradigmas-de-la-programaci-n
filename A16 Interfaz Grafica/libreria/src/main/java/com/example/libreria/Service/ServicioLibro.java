package com.example.libreria.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.libreria.RepositoryLibrary.IRepoLibros;
import com.example.libreria.model.Books;

@Service
public class ServicioLibro implements IServicioLibro {

    private final IRepoLibros iRepo;

    @Autowired
    public ServicioLibro(IRepoLibros iRepo) {
        this.iRepo = iRepo;
    }

    @Override
    public List<Books> obtenerTodos() {
        return iRepo.findAll();
    }

    @Override
    public Optional<Books> obtenerPorId(Long id) {
        return iRepo.findById(id);
    }

    @Override
    public Books guardar(Books libro) {
        iRepo.save(libro);
        return libro;
    }

    @Override
    public void eliminarPorId(Long id) {
        iRepo.deleteById(id);
    }

    @Override
    public String buscaLibroPorTitulo(String titulo) {
        boolean encontrado = iRepo.findAll().stream()
                .anyMatch(l -> l.getTitulo() != null && l.getTitulo().equalsIgnoreCase(titulo));
        return encontrado ? "Libro encontrado" : "Libro no encontrado";
    }
}