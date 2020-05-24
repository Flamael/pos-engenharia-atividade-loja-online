/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.loja.core;

import java.util.List;
import java.util.Map;
import com.pos.loja.models.Database;
import com.pos.loja.models.Venda;
import java.util.stream.Collectors;

/**
 *
 * @author felip
 */
public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic
        try {
            Database db = new Database();
            Map<String, List<Object>> data = db.getData();

            System.out.println("================= EXTRATO DE VENDAS ====================");

            List<Venda> vendas = data.get("Vendas")
                    .stream()
                    .filter(Venda.class::isInstance)
                    .map(Venda.class::cast)
                    .collect(Collectors.toList());

            for (Venda venda : vendas) {
                venda.finalizarCompra();
            }

            System.out.println();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
