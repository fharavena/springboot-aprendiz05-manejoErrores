package com.bolsadeideas.springboot.error.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.error.app.models.domain.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private List<Usuario> lista;
	
	
	
	public UsuarioServiceImpl() {
		this.lista = new ArrayList<>();
		this.lista.add(new Usuario(1, "nombre1", "apellido1"));
		this.lista.add(new Usuario(2, "nombre2", "apellido2"));
		this.lista.add(new Usuario(3, "nombre3", "apellido3"));
		this.lista.add(new Usuario(4, "nombre4", "apellido4"));
		this.lista.add(new Usuario(5, "nombre5", "apellido5"));
		this.lista.add(new Usuario(6, "nombre6", "apellido6"));
		this.lista.add(new Usuario(7, "nombre7", "apellido7"));
		this.lista.add(new Usuario(8, "nombre8", "apellido8"));
		
	}

	@Override
	public List<Usuario> listar() {
		return this.lista;
	}

	@Override
	public Usuario obtenerPorId(Integer id) {
		Usuario resultado = null;
		for (Usuario u: this.lista) {
			if (u.getId().equals(id)) {
				resultado=u;
				break;
			}
		}
		
		return resultado;
	}

	@Override
	public Optional<Usuario> obtenerPorIdOptional(Integer id) {
		Usuario usuario = this.obtenerPorId(id);
		return Optional.ofNullable(usuario);
	}

}
