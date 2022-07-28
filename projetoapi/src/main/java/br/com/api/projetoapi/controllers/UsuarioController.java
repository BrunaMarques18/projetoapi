package br.com.api.projetoapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.projetoapi.entities.Usuario;
import br.com.api.projetoapi.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {
	@Autowired
	private UsuarioService service;
	
	@PostMapping
	public ResponseEntity<Usuario> cadastrar(@RequestBody Usuario usuario){
		return ResponseEntity.status(HttpStatus.CREATED).body(service.cadastrar(usuario));
	}
	
	@PostMapping(value = "/login/")
	public ResponseEntity<Boolean> login(@RequestBody Usuario usuario){
		return ResponseEntity.ok(service.login(usuario));
	}
}
