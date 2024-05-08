package com.Giulia.webServices.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Giulia.webServices.entidades.Categoria;
import com.Giulia.webServices.repositorios.CategoriaRepositorio;

@Service
public class CategoriaServicos {

	@Autowired
	private CategoriaRepositorio repositorio;

	public List<Categoria> findAll() {
		return repositorio.findAll();
	}

	public Categoria findById(Long id) {
		Optional<Categoria> Categoria = repositorio.findById(id);
		return Categoria.get();
	}
}
