package br.com.edward.restfull.Service;


import br.com.edward.restfull.model.CarrinhoModel;

public interface CarrinhoService {

	CarrinhoModel adicionar(Integer qtd, Long idProduto);

	CarrinhoModel remover(Long idItem);

	CarrinhoModel mostrarTudo();

}
