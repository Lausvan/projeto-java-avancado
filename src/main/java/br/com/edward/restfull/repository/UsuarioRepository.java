package br.com.edward.restfull.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edward.restfull.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
