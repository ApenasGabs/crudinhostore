package com.apenasgabs.crudinhostore.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apenasgabs.crudinhostore.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
  
  List<Categoria> findByNomeContainingIgnoreCase(String nome);

}
