package com.hibernate.ferreteria;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hibernate.ferreteria.Repositories.RepoArticles;
import com.hibernate.ferreteria.entity.Articulos;

@SpringBootApplication
public class FerreteriaApplication implements CommandLineRunner {

    @Autowired
    private RepoArticles repositorio;

    public static void main(String[] args) {
        SpringApplication.run(FerreteriaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Aplicación iniciada correctamente");
        List<Articulos> articulos = repositorio.findAll();
        articulos.stream().forEach(System.out::println);
    }
}
