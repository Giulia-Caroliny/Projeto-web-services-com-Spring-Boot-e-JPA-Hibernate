package com.Giulia.webServices.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Giulia.webServices.entidades.ItemPedido;
import com.Giulia.webServices.entidades.pk.ItemPedidoPk;

@Repository
public interface ItemPedidoRepositorio extends JpaRepository<ItemPedido, ItemPedidoPk> {

}
