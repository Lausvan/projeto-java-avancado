package br.com.edward.restfull.Service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Service;

import br.com.edward.restfull.Service.PessoaService;
import br.com.edward.restfull.model.FarmaceuticoModel;
import br.com.edward.restfull.model.FornecedorModel;
import br.com.edward.restfull.model.PessoaModel;

@Service
public class PessoaServiceImpl implements PessoaService{ 
	
	public static final List<PessoaModel> pessoas = new ArrayList<PessoaModel>();

	@Override
	public PessoaModel param(String nome) {
		return new FornecedorModel(nome);
	}

	@Override
	public PessoaModel path(String nome) {
		return new FarmaceuticoModel(nome);
	}

	@Override
	public PessoaModel perguntar(PessoaModel model) {
		pessoas.add(model);
		return model;
	}

	@Override
	public List<PessoaModel> remove(Long id) {
		PessoaModel pessoaRemover = pessoas.stream().filter(item -> id.equals(item.getId())).findAny().orElse(null);
		if (Objects.nonNull(pessoaRemover)) {
			pessoas.remove(pessoaRemover);
		}
		return pessoas;

	}

	@Override
	public List<PessoaModel> lista() {
		return pessoas;
	} 
	
}
