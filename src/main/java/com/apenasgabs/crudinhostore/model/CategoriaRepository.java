package com.apenasgabs.crudinhostore.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Produto, Long> {
  
  List<Produto> findByCategoriaId(Long categoriaId);

}
