package com.Giulia.webServices.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Giulia.webServices.entidades.Usuario;
import com.Giulia.webServices.repositorios.UsuarioRepositorio;

@Service
public class UsuarioServicos {

	@Autowired
	private UsuarioRepositorio repositorio;
	
	public List<Usuario> findAll(){
		return repositorio.findAll();
	}
	

	public Usuario findById(Long id) {
		Optional<Usuario> user = repositorio.findById(id);
		return user.get();
	}
	
}
