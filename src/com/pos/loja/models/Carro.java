package com.pos.loja.models;

import com.pos.loja.interfaces.Motor;

public class Carro extends Automovel implements Motor{
  private int portas;

  public Carro(int ano, int preco, int potencia, int quilometragem, String cor, String tipoPotencia, String modelo,
      String combustivel, int portas) {
    super(ano, preco, potencia, quilometragem, cor, tipoPotencia, modelo, combustivel, Automovel.CARRO);

    this.portas = portas;
  }

     @Override
    public void condicoesDeUso(String condicao) {
        System.out.println("O Motor do "+Automovel.CARRO+" está: "+condicao);
    }
}