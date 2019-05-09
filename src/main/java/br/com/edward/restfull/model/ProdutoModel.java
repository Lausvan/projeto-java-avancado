package br.com.edward.restfull.model;

public class ProdutoModel {

	private static Long cont = 0L;

	private String nome;
	private Double preco; 
	private Integer estoque;
	private final Long id;

	public ProdutoModel() {
		this.id = ++cont;
	}

	public ProdutoModel(String nome, Double preco, Integer estoque) {
		this();
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
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
	

	public Integer getEstoque() {
		return estoque;
	}

	public ProdutoModel alterar(ProdutoModel model) {
		this.nome = model.nome;
		this.preco = model.preco;
		this.estoque = model.estoque;
		return model;
	} 
	
	public void removeEstoque(int qtd) {
		this.estoque -= qtd;
	} 
	
	public void adicionaEstoque(int qtd) {
		this.estoque += qtd;
	}

}
