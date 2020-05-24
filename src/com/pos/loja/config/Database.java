package com.pos.loja.config;

import com.pos.loja.utils.Mock;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {

    private final Map<String, List<Object>> data = new HashMap<String, List<Object>>();

    public Database() {
        /**
         * ******************* MOCK DADOS INICIAIS *************************
         */
        System.out.println("Rodando seed com dados iniciais...");
        data.put("com.pos.loja.models.Cliente", Mock.clientes());
        data.put("com.pos.loja.models.Automovel", Mock.automoveis());
        data.put("com.pos.loja.models.Venda", Mock.vendas());
    }

    public Map<String, List<Object>> selectAll() {
        return data;
    }

    public void salvar(Object item) { 
        data.get(item.getClass().getName()).add(item);
    }
}
