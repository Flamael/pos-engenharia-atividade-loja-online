package com.pos.loja.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public Cliente getCliente() {
        return cliente;
    }

    public List<Automovel> getAutomoveis() {
        return automoveis;
    }

    public void finalizarCompra() {
        for (Automovel automovel : automoveis) {
            System.out.println(automovel.toString());
        }

        int valorTotal = automoveis
                .stream()
                .mapToInt(Automovel::getPreco)
                .reduce(0, (subTotal, preco) -> subTotal + preco);
        System.out.println("---------------------");
        System.out.println("Total: " + valorTotal + " R$");
    }
}
