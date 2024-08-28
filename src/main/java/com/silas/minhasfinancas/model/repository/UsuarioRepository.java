package com.silas.minhasfinancas.model.repository;

import com.silas.minhasfinancas.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // select * from usuario where email = email
    // Optional<Usuario> findByEmail(String email);

    // select * from usuario where email exists
    boolean existsByEmail(String email);

    Optional<Usuario> findByEmail (String email);

}
