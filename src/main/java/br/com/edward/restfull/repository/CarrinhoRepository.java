package br.com.edward.restfull.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.edward.restfull.domain.Carrinho;
import br.com.edward.restfull.domain.Usuario;

@Repository
public interface CarrinhoRepository extends JpaRepository<Carrinho, Long> {

}
