package com.apenasgabs.crudinhostore.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")
public class Produto {
  
  @Id
  @GeneratedValue
  private Long id_produto;

  @NotBlank(message = "Nome e obrigatório!")
  @Size(min = 5, max = 100)
  private String nome;

  @NotBlank(message = "Descrição e obrigatório!")
  @Size(min = 5, max = 100)
  private String descricao;

  @NotNull(message = "Preço é obrigatório!")
  @DecimalMin(value = "0.0", inclusive = false, message = "O preço deve ser maior que 0")
  @Digits(integer=6, fraction=2, message = "O preço deve ter no máximo 6 dígitos inteiros e 2 fracionários")
  private BigDecimal preco;

  public Long getId_produto() {
    return this.id_produto;
  }

  public void setId_produto(Long id_produto) {
    this.id_produto = id_produto;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return this.descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public BigDecimal getPreco() {
    return this.preco;
  }

  public void setPreco(BigDecimal preco) {
    this.preco = preco;
  }

}
