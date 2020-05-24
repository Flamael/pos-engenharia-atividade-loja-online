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
        List<Object> table = null;
        try {
            table = data.get(item.getClass().getSimpleName());
            table.add(item);
            return table.size() - 1;
        } catch (NullPointerException ex) {
            table = data.get(item.getClass().getSuperclass().getSimpleName());
        } finally {
            if (table != null) {
                table.add(item);
                return table.size() - 1;
            }
        }
        return 0;
    }

    public Object findById(String table, int id) {
        return data.get(table).get(id);
    }
}
