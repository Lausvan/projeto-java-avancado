package br.com.edward.restfull.controller;


import java.util.Objects;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.edward.restfull.model.CarrinhoModel;
import br.com.edward.restfull.model.ItemModel;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {
	
	private static final CarrinhoModel carrinho = new CarrinhoModel();
	
	@PostMapping("/adicionar-ao-carrinho")
	public CarrinhoModel cadastrar(@RequestParam Long id, Integer quantidade) {
		carrinho.getItens().add(new ItemModel (ProdutoController.produtos.stream().filter(item -> id.equals(item.getId())).findAny().orElse(null), quantidade));
		return carrinho;
	} 
	
	@DeleteMapping("/remove")
	public CarrinhoModel remove(@RequestParam Long id, Integer quantidade){    
		ItemModel itemRemover = carrinho.getItens().stream().filter(item -> id.equals(item.getProduto().getId())).findAny().orElse(null); 
		if(Objects.nonNull(itemRemover)) {
			carrinho.getItens().remove(itemRemover);
		}
		return carrinho;
	}  
	
	@GetMapping("/listar-produtos")
	public CarrinhoModel listarProdutos() { 
		return carrinho;
	}   
	

}
