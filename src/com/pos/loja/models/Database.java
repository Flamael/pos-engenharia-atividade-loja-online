package com.pos.loja.models;

import com.pos.loja.utils.Mock;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {

  private final Map<String, List<Object>> data = new HashMap<String, List<Object>>();
  
 public Map<String, List<Object>> getData(){ 
    
     /********************* MOCK **************************/ 
    data.put("Clientes",Mock.clientes());
    data.put("Automoveis",Mock.automoveis());
    data.put("Vendas",Mock.vendas());

    return data;
}
}