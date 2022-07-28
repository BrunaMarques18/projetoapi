package br.com.api.projetoapi.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "tb_produto")
@Data
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_produto")
	private Long id;
	@Column
	private String nome;
	@Column
	private Double preco;
	@Column
	private Date dtCadastro;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_usuario")
	private Usuario usuario;
}
