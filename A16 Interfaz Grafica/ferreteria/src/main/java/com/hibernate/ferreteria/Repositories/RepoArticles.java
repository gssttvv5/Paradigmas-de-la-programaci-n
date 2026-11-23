package com.hibernate.ferreteria.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hibernate.ferreteria.entity.Articulos;

public interface RepoArticles extends JpaRepository<Articulos, Long> {
}