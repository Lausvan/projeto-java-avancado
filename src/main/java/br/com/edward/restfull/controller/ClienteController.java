package br.com.edward.restfull.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.edward.restfull.model.ClienteModel;
import br.com.edward.restfull.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController { 
	
	 @Autowired
	    private ClienteService clienteService; 
	 
	 @PostMapping("/cadastrar")
	    public ClienteModel cadastrar(@RequestBody ClienteModel model) {
	        return new ClienteModel(clienteService.cadastra(model));
	    }

}
