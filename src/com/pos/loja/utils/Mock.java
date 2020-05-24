package com.pos.loja.utils;

import com.pos.loja.factories.AutomovelFactory;
import com.pos.loja.factories.ClienteFactory;
import com.pos.loja.factories.VendaFactory;
import com.pos.loja.models.Automovel;
import com.pos.loja.models.Venda;
import java.util.ArrayList;
import java.util.List;

public class Mock {

    public static List<Object> automoveis() {
        List<Object> automoveis = new ArrayList<>();
        automoveis.add(AutomovelFactory.spyCaminhao(32002, 25523, 400, 22873, "Purple", "hp", "Silverado 2500", "Diesel", 2, 34241));
        automoveis.add(AutomovelFactory.spyCaminhao(121245, 25523, 400, 22873, "Red", "hp", "Silver", "Gas", 2, 34241));
        automoveis.add(AutomovelFactory.spyCarro(878, 787854, 400, 4545, "Blue", "cv", "Corola", "Diesel", 2));
        automoveis.add(AutomovelFactory.spyCarro(4545, 454, 44, 5545, "Purple", "cv", "Hiunday", "Gasoline", 4));
        automoveis.add(AutomovelFactory.spyMoto(88, 782314, 400, 4545, "Orange", "cv", "Suzuki", "Gasoline"));
        automoveis.add(AutomovelFactory.spyMoto(45, 123213, 44, 5545, "Yellow", "cv", "Honda", "Gasoline"));
        return automoveis;
    }

    public static List<Object> clientes() {
        List<Object> clientes = new ArrayList<>();
        clientes.add(ClienteFactory.spyVenda("Ranniery", "135464231"));
        clientes.add(ClienteFactory.spyVenda("Felipe", "45646786"));
        clientes.add(ClienteFactory.spyVenda("Bruno", "87854212"));
        return clientes;
    }

    public static List<Object> vendas() {
        List<Object> vendas = new ArrayList<>();
        clientes().forEach(objectCliente -> {
            Venda venda = VendaFactory.spyVenda(objectCliente);
            venda.addAutomovel((Automovel) automoveis().get(GeradorDeNumeros.get(automoveis().size())));
            venda.addAutomovel((Automovel) automoveis().get(GeradorDeNumeros.get(automoveis().size())));
            venda.setFormaDePagamento("Dinheiro");
            vendas.add(venda);
        });
        return vendas;
    }
}
