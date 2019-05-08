package br.com.edward.restfull.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.edward.restfull.Service.ProdutoService;
import br.com.edward.restfull.model.ProdutoModel;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;

	@PostMapping("/cadastrar")
	public ProdutoModel cadastrar(@RequestBody ProdutoModel model) {
		return produtoService.adicionar(model);
	}

}
