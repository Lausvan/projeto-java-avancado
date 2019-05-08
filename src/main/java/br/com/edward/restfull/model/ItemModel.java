package br.com.edward.restfull.model;

public class ItemModel {

	private ProdutoModel produto;
	private Integer quantidade;

	public ItemModel(ProdutoModel produto, Integer quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public ProdutoModel getProduto() {
		return produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	} 

}

