package br.com.edward.restfull.Service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.edward.restfull.Service.ProdutoService;
import br.com.edward.restfull.model.ProdutoModel;

@Service
public class ProdutoServiceImpl implements ProdutoService{ 
	
	public static final List<ProdutoModel> produtos = new ArrayList<ProdutoModel>();
	

	@Override
	public ProdutoModel adicionar(ProdutoModel model) {
		produtos.add(model);
		return model;
	}

}
