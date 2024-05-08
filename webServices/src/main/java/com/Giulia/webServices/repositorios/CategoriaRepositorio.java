package com.Giulia.webServices.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Giulia.webServices.entidades.Categoria;

@Repository
public interface CategoriaRepositorio extends JpaRepository<Categoria, Long> {

}
