package com.apenasgabs.crudinhostore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apenasgabs.crudinhostore.model.Produto;
import com.apenasgabs.crudinhostore.repository.ProdutoRepository;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/produto")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProdutoController {

  @Autowired
  private ProdutoRepository produtoRepository;

  @GetMapping("/todos")
  public ResponseEntity<List<Produto>> getTodosProdutos() {
    return ResponseEntity.ok(produtoRepository.findAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Produto> getProdutoPeloId(@PathVariable Long id) {
    return produtoRepository.findById(id).map(response -> ResponseEntity.ok(response))
        .orElse(ResponseEntity.notFound().build());
  }

  @PostMapping
  public ResponseEntity<Produto> cadastrarProduto(@Valid @RequestBody Produto novoProduto) {
    Produto produtoCriado = produtoRepository.save(novoProduto);
    return ResponseEntity.status(HttpStatus.CREATED).body(produtoCriado);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Produto> editarProduto(@Valid @RequestBody Produto produtoAtualizado) {
    return produtoRepository.findById(produtoAtualizado.getId_produto())
        .map(response -> ResponseEntity.status(HttpStatus.OK).body(produtoRepository.save(produtoAtualizado)))
        .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
  }

  

}
