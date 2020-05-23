package com.pos.loja.models;

public class Moto extends Automovel {

  public Moto(int ano, int preco, int potencia, int quilometragem, String cor, String tipoPotencia, String modelo,
      String combustivel) {
    super(ano, preco, potencia, quilometragem, cor, tipoPotencia, modelo, combustivel, Automovel.MOTO);
 
  }
}