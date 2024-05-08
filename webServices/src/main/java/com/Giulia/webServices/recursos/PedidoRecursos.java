package com.Giulia.webServices.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Giulia.webServices.entidades.Pedido;
import com.Giulia.webServices.servicos.PedidoServicos;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoRecursos {
	
	@Autowired
	private PedidoServicos servicos;

	@GetMapping
	public ResponseEntity<List<Pedido>> findAll(){
		List<Pedido> lista = servicos.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Pedido> findById(@PathVariable Long id){
		Pedido pedido = servicos.findById(id);
		return ResponseEntity.ok().body(pedido);
	}
	
}
