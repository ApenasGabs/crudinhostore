package com.apenasgabs.crudinhostore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apenasgabs.crudinhostore.model.Produto;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	// FIXME pela categoria procurar pelo nome do produto la no repository da
	// categoria
	List<Produto> findByCategoriaId(Long Id);

}
