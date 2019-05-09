package br.com.edward.restfull.model;

import java.time.ZonedDateTime;

public abstract class PessoaModel {

	private static Long cont = 0L;

	 private ZonedDateTime dataCriacao;
	private String nome;
	private String documento;
	private Double peso;
	private Integer idade;
	private String genero;
	private final Long id;

	public PessoaModel() {
		this.id = ++cont;
		this.dataCriacao = ZonedDateTime.now();
	} 	 


	public PessoaModel(String nome) {
		this();
		this.nome = nome;
	}

	public abstract boolean getDocumentacaoValida();

	public String getNome() {
		return nome;
	}

	public String getDocumento() {
		return documento;
	}

	public Double getPeso() {
		return peso;
	}

	public Long getId() {
		return id;
	}

	public Integer getIdade() {
		return idade;
	}

	public String getGenero() {
		return genero;
	}

	public ZonedDateTime getDataCriacao() {
		return dataCriacao;
	}
}
