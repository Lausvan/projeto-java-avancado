package br.com.edward.restfull.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.edward.restfull.model.CarrinhoModel;
import br.com.edward.restfull.model.FinalizaCarrinhoModel;
import br.com.edward.restfull.model.ItemCarrinhoModel;
import br.com.edward.restfull.service.CarrinhoService;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {

    @Autowired
    private CarrinhoService carrinhoService;
    
    @PostMapping("/adicionar")
    public CarrinhoModel adicionar(@RequestParam Integer qtd, @RequestParam Long id) {
       return new CarrinhoModel(carrinhoService.adicionar(qtd, id));
    }
    
    @GetMapping("/mostrar-tudo")
    public CarrinhoModel mostrarTudo() {
        return new CarrinhoModel(carrinhoService.mostrarTudo());
    }
    
    @GetMapping("/finalizar-carrinho")
    public CarrinhoModel finalizarCarrinho(@Valid @RequestBody FinalizaCarrinhoModel model, BindingResult bindingResult ) {
    	if(!bindingResult.hasErrors()) {
        return new CarrinhoModel(carrinhoService.finaliza(model.getIdCliente()));
    	}
    	throw new RuntimeException("Model com erros");
    }
    
    @DeleteMapping("/remover")
    public ItemCarrinhoModel remover(@RequestParam Long id) {
        return new ItemCarrinhoModel(carrinhoService.remover(id));
    }
}
