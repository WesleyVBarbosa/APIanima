package com.github.wesleyvbarbosa.apianima.repository;

import com.github.wesleyvbarbosa.apianima.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
