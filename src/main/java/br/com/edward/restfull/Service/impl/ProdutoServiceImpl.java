package br.com.edward.restfull.Service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;

import br.com.edward.restfull.Service.ProdutoService;
import br.com.edward.restfull.model.ProdutoModel;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	public static final List<ProdutoModel> produtos = new ArrayList<ProdutoModel>();

	@Override
	public ProdutoModel adicionar(ProdutoModel model) {
		ProdutoModel prod = new ProdutoModel();
		Boolean verifica = false;
		for (ProdutoModel produtoModel : produtos) {
			if (produtoModel.getId() == model.getId()) {
				prod = produtoModel;
				verifica = true;
			}
		}
		if (verifica == true) {
			throw new RuntimeErrorException(null, "Error: Id repetido");
		} else {
			produtos.add(model);
			return model;

		}
	}

	@Override
	public ProdutoModel consultar(Long id) {
		return produtos.stream().filter(item -> id.equals(item.getId())).findAny().orElse(null);
	}

	@Override
	public ProdutoModel alterar(ProdutoModel model) {
		ProdutoModel prod = new ProdutoModel();
		Boolean verifica = false;
		for (ProdutoModel produtoModel : produtos) {
			if (produtoModel.getId() == model.getId()) {
				prod = produtoModel;
				verifica = true;
			}
		}
		if (verifica == false) {
			throw new RuntimeErrorException(null, "Error: Id não encontrado");
		} else {
			return consultar(model.getId()).alterar(model);
		}
	}

}
