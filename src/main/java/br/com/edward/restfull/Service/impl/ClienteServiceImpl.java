package br.com.edward.restfull.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.edward.restfull.domain.Cliente;
import br.com.edward.restfull.domain.Fornecedor;
import br.com.edward.restfull.model.ClienteModel;
import br.com.edward.restfull.repository.ClienteRepository;
import br.com.edward.restfull.service.ClienteService;

@Transactional
@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
    private ClienteRepository clienteRepository;

	@Override
	public Cliente cadastra(ClienteModel model) {
		return clienteRepository.save(new Cliente(model));
	}
	
	  @Override
	    public Optional<Cliente> findById(Long id) {
	        return clienteRepository.findById(id);
	    }

}
