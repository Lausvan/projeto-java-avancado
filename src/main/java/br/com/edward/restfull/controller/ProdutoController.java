package br.com.edward.restfull.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.edward.restfull.model.ProdutoModel;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
	public static List<ProdutoModel> produtos = new ArrayList();

	@PostMapping("/cadastrar")
	public ProdutoModel cadastrar(@RequestBody ProdutoModel model) {
		produtos.add(model);
		return model;
	} 
	
}
