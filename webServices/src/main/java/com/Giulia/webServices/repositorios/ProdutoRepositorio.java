package com.Giulia.webServices.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Giulia.webServices.entidades.Produto;

@Repository
public interface ProdutoRepositorio extends JpaRepository<Produto, Long> {

}
