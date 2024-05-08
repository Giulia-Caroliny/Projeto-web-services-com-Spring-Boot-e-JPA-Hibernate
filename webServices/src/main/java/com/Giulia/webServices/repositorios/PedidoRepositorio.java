package com.Giulia.webServices.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Giulia.webServices.entidades.Pedido;

@Repository
public interface PedidoRepositorio extends JpaRepository<Pedido, Long>{

}
