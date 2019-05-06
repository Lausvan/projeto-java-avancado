package br.com.edward.restfull.model;

import java.time.ZonedDateTime;

public class PessoaModel {

	private ZonedDateTime dataCriacao;
	private String nome; 
	private Double peso; 
	private Integer idade; 
	private String genero; 
	private long id;

	public PessoaModel() {
		this.dataCriacao = ZonedDateTime.now();
	}

	public PessoaModel(String nome) {
		this();
		this.nome = nome;
	}
	
	

	public PessoaModel(long id) {
		super();
		this.id = id;
	}

	public PessoaModel(String nome, Double peso, Integer idade, String genero, long id) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.idade = idade;
		this.genero = genero; 
		this.id = id;
	}

	public String getNome() {
		return nome;
	} 
	
	public Double getPeso() {
		return peso;
	}

	public long getId() {
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
