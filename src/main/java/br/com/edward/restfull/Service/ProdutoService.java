package br.com.edward.restfull.Service;

import br.com.edward.restfull.model.ProdutoModel;

public interface ProdutoService {

	ProdutoModel adicionar(ProdutoModel model);

	ProdutoModel consultar(Long id);

	ProdutoModel alterar(ProdutoModel model);

}
