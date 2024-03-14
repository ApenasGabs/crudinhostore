package com.apenasgabs.crudinhostore.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.apenasgabs.crudinhostore.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
  
}
