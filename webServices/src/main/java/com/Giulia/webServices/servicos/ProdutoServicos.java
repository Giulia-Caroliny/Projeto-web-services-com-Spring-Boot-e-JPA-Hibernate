package com.Giulia.webServices.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Giulia.webServices.entidades.Produto;
import com.Giulia.webServices.repositorios.ProdutoRepositorio;

@Service
public class ProdutoServicos {

	@Autowired
	private ProdutoRepositorio repositorio;

	public List<Produto> findAll() {
		return repositorio.findAll();
	}

	public Produto findById(Long id) {
		Optional<Produto> Produto = repositorio.findById(id);
		return Produto.get();
	}
}
