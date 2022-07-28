package br.com.api.projetoapi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.projetoapi.entities.Usuario;
import br.com.api.projetoapi.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository repository;
	
	public Usuario cadastrar(Usuario usuario) {
		return repository.save(usuario);
	}
	
	public Boolean login(Usuario usuario){
		Optional<Usuario> optionalUsuario = repository.findByLoginAndSenha(usuario.getLogin(), usuario.getSenha());
		
		if(optionalUsuario.isEmpty()) {
			return false;
		}
		
		Usuario usuarioBanco = optionalUsuario.get();
		
		if(usuario.getLogin().equalsIgnoreCase(usuarioBanco.getLogin()) && usuario.getSenha().equalsIgnoreCase(usuarioBanco.getSenha())) {
			return true;
		}
		
		return false;
	}
}
