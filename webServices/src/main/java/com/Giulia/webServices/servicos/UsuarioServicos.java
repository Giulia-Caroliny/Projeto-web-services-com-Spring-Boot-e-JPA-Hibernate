package com.Giulia.webServices.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.Giulia.webServices.entidades.Usuario;
import com.Giulia.webServices.repositorios.UsuarioRepositorio;
import com.Giulia.webServices.servicos.exceptions.DatabaseException;
import com.Giulia.webServices.servicos.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UsuarioServicos {

	@Autowired
	private UsuarioRepositorio repositorio;

	public List<Usuario> findAll() {
		return repositorio.findAll();
	}

	public Usuario findById(Long id) {
		Optional<Usuario> user = repositorio.findById(id);
		return user.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public Usuario inserir(Usuario usuario) {
		return repositorio.save(usuario);
	}

	public void deletar(Long id) {
		try {
			repositorio.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}

	public Usuario atualizar(Long id, Usuario usuario) {
		try {
			Usuario aux = repositorio.getReferenceById(id);
			atualizar(aux, usuario);
			return repositorio.save(aux);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}

	private void atualizar(Usuario aux, Usuario usuario) {
		aux.setNome(usuario.getNome());
		aux.setEmail(usuario.getEmail());
		aux.setTelefone(usuario.getTelefone());
	}
}
