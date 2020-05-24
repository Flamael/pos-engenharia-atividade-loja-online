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
        data.put("Cliente", Mock.clientes());
        data.put("Automovel", Mock.automoveis());
        data.put("Venda", Mock.vendas());
    }

    public Map<String, List<Object>> selectAll() {
        return data;
    }

    public int salvar(Object item) {

        try {
            List<Object> tabela = null;
            String nomeTable = item.getClass().getSimpleName();
            //verficar se tem parente/herança
            if (!data.keySet().contains(nomeTable)) {
                String nomeParente = item.getClass().getSuperclass().getSimpleName();
                tabela = data.get(nomeParente);
            }else{
                tabela = data.get(item.getClass().getSimpleName());
            }           
            
            tabela.add(item);
            return tabela.size() - 1;
        } catch (NullPointerException ex) {
            return 0;
        }
    }

    public Object findById(String tabela, int id) {
        return data.get(tabela).get(id);
    }
}
