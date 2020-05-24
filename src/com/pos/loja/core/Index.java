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
import com.pos.loja.factories.AutomovelFactory;
import com.pos.loja.factories.ClienteFactory;
import com.pos.loja.factories.VendaFactory;
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
            //selecionar todos os itens da base
            Map<String, List<Object>> data = connection.selectAll();

            //ações do banco de dados
            //cria um automovel e um clinete
            int idAutomovel = connection.salvar((AutomovelFactory.spyMoto(30, 164, 45, 4500, "Pink", "cc", "Yamara", "Alcool")));
            int idCliente = connection.salvar(ClienteFactory.spyCliente("Leonardo", "135468784"));
            //seleciona cliente a partir do id e salva uma nova venda
            Venda novaVenda = VendaFactory.spyVenda(connection.index("Cliente", idCliente));
            novaVenda.addAutomovel((Automovel) connection.index("Automovel", idAutomovel));
            novaVenda.setFormaDePagamento("Crédito");
            //cria uma venda com a conexão
            connection.salvar(novaVenda);

            System.out.println("================= EXTRATO DE VENDAS ====================");

            List<Venda> vendas = data.get("Venda")
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
