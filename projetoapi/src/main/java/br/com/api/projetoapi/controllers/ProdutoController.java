package br.com.api.projetoapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.projetoapi.entities.Produto;
import br.com.api.projetoapi.services.ProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {
	@Autowired
	private ProdutoService service;
	
	@PostMapping
	public ResponseEntity<Produto> cadastrar(@RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.CREATED).body(service.cadastrar(produto));
	}
	
	@GetMapping
	public ResponseEntity<List<Produto>> listar(){
		return ResponseEntity.ok(service.listar());
	}
}
