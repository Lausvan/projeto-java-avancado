package br.com.edward.restfull.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.edward.restfull.domain.Pessoa;
import br.com.edward.restfull.repository.PessoaRepository;
import br.com.edward.restfull.service.PessoaService;

@Service
public class PessoaServiceImpl implements PessoaService {

	@Autowired
    private PessoaRepository pessoaRepository;
    

    @Override
    public Pessoa consultar(Long idPessoa) {
        return pessoaRepository.findById(idPessoa).orElse(null);
    }
    
    @Override
    public List<Pessoa> mostrarTudo() {
        return pessoaRepository.findAll();
    }

    @Override
    public Pessoa remover(Long id) {
        Pessoa pessoaRemover = this.consultar(id);
        pessoaRepository.delete(pessoaRemover);
        return pessoaRemover;
    }
}
