/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.loja.core;

import com.pos.loja.interfaces.Motor;
import com.pos.loja.models.Automovel;
import java.util.List;
import java.util.Map;
import com.pos.loja.config.Database;
import com.pos.loja.factories.ClienteFactory;
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
        try {
            
            //Conexão com banco de dados
            Database connection = new Database();
            //seleciona todos os itens da base
            Map<String, List<Object>> data = connection.selectAll();
            
            connection.salvar(ClienteFactory.spyVenda("cicim", "135468784"));
            
            
            
            System.out.println("================= EXTRATO DE VENDAS ====================");

            List<Venda> vendas = data.get("com.pos.loja.models.Venda")
                    .stream()
                    .filter(Venda.class::isInstance)
                    .map(Venda.class::cast)
                    .collect(Collectors.toList());

            for (Venda venda : vendas) {
                System.out.println("---------- " + venda.getCliente().getNome() + " -----------");

                for (Automovel automovel : venda.getAutomoveis()) {
                    Motor motor = (Motor) automovel;
                    System.out.println("Automovel: " + automovel.getModelo() + " - Verificar estado do mortor....");
                    Thread.sleep(1000);//"Ajuste técnico" pra mostrar delay legalzinho antes de finalizar
                    motor.verificarEstadoDoMotor();
                }
                System.out.println();

                venda.finalizarCompra();
                System.out.println("=====================================");
            }

            System.out.println();
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }

}
