package com.apenasgabs.crudinhostore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apenasgabs.crudinhostore.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	List<Produto> findByCategoriaId(Long categoriaId);

}
