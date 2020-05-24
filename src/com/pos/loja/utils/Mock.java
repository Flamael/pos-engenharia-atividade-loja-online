package com.pos.loja.utils;

import com.pos.loja.models.Automovel;
import com.pos.loja.models.Caminhao;
import com.pos.loja.models.Carro;
import com.pos.loja.models.Cliente;
import com.pos.loja.models.Moto;
import com.pos.loja.models.Venda;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mock {

    public static List<Object> automoveis() {
        List<Object> automoveis = new ArrayList<>();
        automoveis.add(new Caminhao(32002, 25523, 400, 22873, "Purple", "hp", "Silverado 2500", "Diesel", 2, 34241));
        automoveis.add(new Caminhao(121245, 25523, 400, 22873, "Red", "hp", "Silver", "Gas", 2, 34241));
        automoveis.add(new Carro(878, 787854, 400, 4545, "Blue", "cv", "Corola", "Diesel", 2));
        automoveis.add(new Carro(4545, 454, 44, 5545, "Purple", "cv", "Hiunday", "Gasoline", 4));
        automoveis.add(new Moto(88, 782314, 400, 4545, "Orange", "cv", "Suzuki", "Gasoline"));
        automoveis.add(new Moto(45, 123213, 44, 5545, "Yellow", "cv", "Honda", "Gasoline"));
        return automoveis;
    }

    public static List<Object> clientes() {
        List<Object> clientes = new ArrayList<>();
        clientes.add(new Cliente("Ranniery", "135464231"));
        clientes.add(new Cliente("Felipe", "45646786"));
        clientes.add(new Cliente("Bruno", "87854212"));
        return clientes;
    }

    public static List<Object> vendas() {
        List<Object> vendas = new ArrayList<>();
        for (Object objectCliente : clientes()) {
            Venda venda = new Venda((Cliente) objectCliente);
            venda.addAutomovel((Automovel) automoveis().get(GeradorDeNumeros.getNumeroAleatorio(automoveis().size())));
            venda.addAutomovel((Automovel) automoveis().get(GeradorDeNumeros.getNumeroAleatorio(automoveis().size())));
            venda.setFormaDePagamento("Dinheiro");
            vendas.add(venda);
        }
        return vendas;
    } 
}
