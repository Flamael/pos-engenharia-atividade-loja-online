package com.pos.loja.models;

public abstract class Automovel {
  private int ano;
  private int preco;
  private int potencia;
  private int quilometragem;
  private String cor;
  private String tipoPotencia;
  private String modelo;
  private String combustivel;
  private String tipo;

  static final String MOTO = "moto";
  static final String CARRO = "carro";
  static final String CAMINHAO = "caminhao";

  Automovel(int ano, int preco, int potencia, int quilometragem, String cor, String tipoPotencia, String modelo,
      String combustivel, String tipo) {
    this.ano = ano;
    this.preco = preco;
    this.potencia = potencia;
    this.quilometragem = quilometragem;
  }
}
