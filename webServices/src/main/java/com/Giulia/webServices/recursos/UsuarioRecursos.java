package com.Giulia.webServices.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Giulia.webServices.entidades.Usuario;
import com.Giulia.webServices.servicos.UsuarioServicos;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioRecursos {

	@Autowired
	private UsuarioServicos servicos;

	@GetMapping
	public ResponseEntity<List<Usuario>> findAll() {
		List<Usuario> lista = servicos.findAll();
		return ResponseEntity.ok().body(lista);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Usuario> findById(@PathVariable Long id) {
		Usuario user = servicos.findById(id);
		return ResponseEntity.ok().body(user);
	}
}
