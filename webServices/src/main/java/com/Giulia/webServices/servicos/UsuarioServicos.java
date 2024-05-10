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

	public List<Usuario> findAll() {
		return repositorio.findAll();
	}

	public Usuario findById(Long id) {
		Optional<Usuario> user = repositorio.findById(id);
		return user.get();
	}
	
	public Usuario inserir(Usuario usuario) {
		return repositorio.save(usuario);
	}
	
	public void deletar(Long id) {
		repositorio.deleteById(id);
	}

	public Usuario atualizar(Long id, Usuario usuario) {
		Usuario aux = repositorio.getReferenceById(id);
		atualizar(aux, usuario);
		return repositorio.save(aux);
	}

	private void atualizar(Usuario aux, Usuario usuario) {
		aux.setNome(usuario.getNome());
		aux.setEmail(usuario.getEmail());
		aux.setTelefone(usuario.getTelefone());
	}
}
