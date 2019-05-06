package br.com.edward.restfull.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.edward.restfull.model.PessoaModel;

@RestController
@RequestMapping("/pessoa")
public class PessoaController { 
	
	private static List<PessoaModel> pessoas = new ArrayList<PessoaModel>();

	@GetMapping("/param")
	public PessoaModel param(@RequestParam String nome) {
		return new PessoaModel(nome);
	}

	@GetMapping("/path/{nome}")
	public PessoaModel path(@PathVariable String nome) {
		return new PessoaModel(nome);
	}

	@PostMapping("/post")
	public PessoaModel perguntar(@RequestBody PessoaModel model) { 
		pessoas.add(model);
		return model;
	}   
	
	@GetMapping("/remove")
	public List<PessoaModel> remove(@RequestParam long id){   
		for (PessoaModel pessoaModel : pessoas) {
			if(pessoaModel.getId() == id) {
				pessoas.remove(pessoaModel);
			}
		}		
		return pessoas;
	}
	
	@GetMapping("/listar")
	public List<PessoaModel> listar() {
		return pessoas;
	}
	
	
}
