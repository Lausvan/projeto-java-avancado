package br.com.edward.restfull.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.edward.restfull.Service.PessoaService;
import br.com.edward.restfull.model.FarmaceuticoModel;
import br.com.edward.restfull.model.FornecedorModel;
import br.com.edward.restfull.model.PessoaModel;

@RestController
@RequestMapping("/pessoa")
public class PessoaController { 
	
	@Autowired
	private PessoaService pessoaService;

	@GetMapping("/param")
	public PessoaModel param(@RequestParam String nome) {
		return pessoaService.param(nome);
	}

	@GetMapping("/path/{nome}")
	public PessoaModel path(@PathVariable String nome) {
		return pessoaService.path(nome);
	}
	
	@PostMapping("/post")
	public PessoaModel perguntar(@RequestBody PessoaModel model) {
		return pessoaService.perguntar(model);
	}

	@DeleteMapping("/remove")
	public List<PessoaModel> remove(@RequestParam Long id) {
		return pessoaService.remove(id);
	}

	@GetMapping("/listar")
	public List<PessoaModel> listar() {
		return pessoaService.lista();
	}
	
}
