package com.pos.loja.models;

import java.util.ArrayList;
import java.util.List;

public class Venda {
  private final Cliente cliente;
  private final List<Automovel> automoveis = new ArrayList<Automovel>();
  private String formaDePagamento;

  public Venda(Cliente cliente) {
    this.cliente = cliente;    
  }

  public void setFormaDePagamento(String formaDePagamento) {
    this.formaDePagamento = formaDePagamento;
  }

  public void addAutomovel(Automovel automovel) {
    this.automoveis.add(automovel);
  }
}