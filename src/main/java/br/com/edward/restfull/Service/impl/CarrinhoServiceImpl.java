package br.com.edward.restfull.Service.impl;

import java.util.Objects;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;

import br.com.edward.restfull.Service.CarrinhoService;
import br.com.edward.restfull.model.CarrinhoModel;
import br.com.edward.restfull.model.ItemModel;

@Service
public class CarrinhoServiceImpl implements CarrinhoService{ 
	
	public static final CarrinhoModel carrinho = new CarrinhoModel();

	@Override
	public CarrinhoModel adicionar(Integer qtd, Long idProduto) { 
		
		if(ProdutoServiceImpl.produtos.stream().filter(item -> idProduto.equals(item.getId())).findAny().orElse(null) != null) {
			ProdutoServiceImpl.produtos.stream().filter(item -> idProduto.equals(item.getId())).findAny().orElse(null).removeEstoque(qtd);
			carrinho.getItens().add(new ItemModel(
					ProdutoServiceImpl.produtos.stream().filter(item -> idProduto.equals(item.getId())).findAny().orElse(null),
					qtd));  
		}else {
			throw new RuntimeErrorException(null, "Id nao encontrado");
		}	
		return carrinho;
	}

	@Override
	public CarrinhoModel remover(Long idItem) {
		ItemModel itemRemover = carrinho.getItens().stream().filter(item -> idItem.equals(item.getProduto().getId()))
				.findAny().orElse(null); 
		itemRemover.getProduto().adicionaEstoque(itemRemover.getQuantidade());
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
