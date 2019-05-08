package br.com.edward.restfull.Service.impl;

import java.util.Objects;

import org.springframework.stereotype.Service;

import br.com.edward.restfull.Service.CarrinhoService;
import br.com.edward.restfull.model.CarrinhoModel;
import br.com.edward.restfull.model.ItemModel;

@Service
public class CarrinhoServiceImpl implements CarrinhoService{ 
	
	public static final CarrinhoModel carrinho = new CarrinhoModel();

	@Override
	public CarrinhoModel adicionar(Integer qtd, Long idProduto) {
		carrinho.getItens().add(new ItemModel(
				ProdutoServiceImpl.produtos.stream().filter(item -> idProduto.equals(item.getId())).findAny().orElse(null),
				qtd));
		return carrinho;
	}

	@Override
	public CarrinhoModel remover(Long idItem) {
		ItemModel itemRemover = carrinho.getItens().stream().filter(item -> idItem.equals(item.getProduto().getId()))
				.findAny().orElse(null);
		if (Objects.nonNull(itemRemover)) {
			carrinho.getItens().remove(itemRemover);
		}
		return carrinho;
	}
	

	@Override
	public CarrinhoModel mostrarTudo() {
		return carrinho;
	}

}
