package com.Giulia.webServices.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Giulia.webServices.entidades.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

}
