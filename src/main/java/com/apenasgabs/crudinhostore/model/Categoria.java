package com.apenasgabs.crudinhostore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long categoriaId;

  @NotBlank(message = "Nome e obrigatório!")
  @Size(min = 5, max = 100)
  private String nome;

  public long getCategoriaId() {
    return this.categoriaId;
  }

  public void setCategoriaId(long categoriaId) {
    this.categoriaId = categoriaId;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

}
