package br.com.api.projetoapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.projetoapi.entities.Produto;
import br.com.api.projetoapi.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository repository;
	
	public Produto cadastrar(Produto produto) {
		return repository.save(produto);
	}
	
	public List<Produto> listar(){
		return repository.findAll();
	}
}
