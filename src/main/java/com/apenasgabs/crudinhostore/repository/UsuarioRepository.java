package com.apenasgabs.crudinhostore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apenasgabs.crudinhostore.model.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	public Optional<Usuario> findByEmail(String email);
	
}