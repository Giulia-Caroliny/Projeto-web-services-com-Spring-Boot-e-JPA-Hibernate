package com.Giulia.webServices.recursos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Giulia.webServices.entidades.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioRecursos {

	@GetMapping
	public ResponseEntity<Usuario> getUsusarios(){
		Usuario u = new Usuario(1L, "giulia", "giulia@email.com", "61999999999", "123");
		return ResponseEntity.ok().body(u);
	}
	
}
