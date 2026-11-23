package com.hibernate.ferreteria.Repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.hibernate.ferreteria.entity.Usuario;

public interface RepoUsers extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByUsuario(String usuario);
}