package br.com.edward.restfull.model;

public class ProdutoModel {

	private static Long cont = 0L;

	private String nome;
	private Double preco;
	private final Long id;

	public ProdutoModel() {
		this.id = ++cont;
	}

	public ProdutoModel(String nome, Double preco) {
		this();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

	public Long getId() {
		return id;
	}

}
