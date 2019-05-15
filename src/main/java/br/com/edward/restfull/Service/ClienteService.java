package br.com.edward.restfull.service;

import java.util.Optional;

import br.com.edward.restfull.domain.Cliente;
import br.com.edward.restfull.model.ClienteModel;

public interface ClienteService {
	
	Cliente cadastra (ClienteModel model);
	Optional<Cliente> findById(Long id);
	
}
