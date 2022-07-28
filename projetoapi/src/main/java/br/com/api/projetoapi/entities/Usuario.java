package br.com.api.projetoapi.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_usuario")
@Data
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_usuario")
	private Long id;
	@Column
	private String nome;
	@Column
	private String email;
	@Column
	private String login;
	@Column
	private String senha;
	@Column
	private Boolean status;
	@OneToMany(mappedBy = "usuario")
	private List<Produto> produtos;
}
