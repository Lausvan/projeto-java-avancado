package br.com.edward.restfull.model;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoModel {

	private final List<ItemModel> itens;

	public CarrinhoModel() {
		this.itens = new ArrayList<>();
	}

	public List<ItemModel> getItens() {
		return itens;
	}

	public Double getTotal() {
		Double soma = 0.0;
		for (ItemModel itemModel : itens) {
			soma += itemModel.getQuantidade() * itemModel.getProduto().getPreco();
		}
		return soma;
	}

}