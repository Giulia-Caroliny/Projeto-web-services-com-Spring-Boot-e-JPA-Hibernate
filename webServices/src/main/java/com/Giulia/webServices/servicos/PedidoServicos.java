package com.Giulia.webServices.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Giulia.webServices.entidades.Pedido;
import com.Giulia.webServices.repositorios.PedidoRepositorio;

@Service
public class PedidoServicos {

	@Autowired
	private PedidoRepositorio repositorio;

	public List<Pedido> findAll() {
		return repositorio.findAll();
	}

	public Pedido findById(Long id) {
		Optional<Pedido> pedido = repositorio.findById(id);
		return pedido.get();
	}
}
