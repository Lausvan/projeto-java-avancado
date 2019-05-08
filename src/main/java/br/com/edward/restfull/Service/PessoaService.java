package br.com.edward.restfull.Service;

import java.util.List;

import br.com.edward.restfull.model.PessoaModel;

public interface PessoaService {
	
	PessoaModel  param( String nome); 
	PessoaModel path(String nome); 
	PessoaModel perguntar (PessoaModel model); 
	List<PessoaModel> remove(Long id);
	List<PessoaModel> lista();

}
