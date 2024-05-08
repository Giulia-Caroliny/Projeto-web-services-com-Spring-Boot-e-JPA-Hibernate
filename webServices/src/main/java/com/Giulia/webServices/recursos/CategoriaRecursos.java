package com.Giulia.webServices.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Giulia.webServices.entidades.Categoria;
import com.Giulia.webServices.servicos.CategoriaServicos;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaRecursos {

	@Autowired
	private CategoriaServicos servicos;

	@GetMapping
	public ResponseEntity<List<Categoria>> findAll() {
		List<Categoria> lista = servicos.findAll();
		return ResponseEntity.ok().body(lista);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Categoria> findById(@PathVariable Long id) {
		Categoria user = servicos.findById(id);
		return ResponseEntity.ok().body(user);
	}
}
