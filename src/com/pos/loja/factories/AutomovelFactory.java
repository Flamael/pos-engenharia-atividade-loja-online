/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.loja.factories;

import com.pos.loja.models.Caminhao;
import com.pos.loja.models.Carro;
import com.pos.loja.models.Cliente;
import com.pos.loja.models.Moto;
import com.pos.loja.models.Venda;

/**
 *
 * @author felip
 */
public class AutomovelFactory {

    public static Carro spyCarro(int ano, int preco, int potencia, int quilometragem, String cor, String tipoPotencia, String modelo,
            String combustivel, int portas) {
        return new Carro(ano, preco, potencia, quilometragem, cor, tipoPotencia, modelo,
                combustivel, portas);
    }

    public static Caminhao spyCaminhao(int ano, int preco, int potencia, int quilometragem, String cor, String tipoPotencia, String modelo,
            String combustivel, int portas, int capacidadeDeCarga) {
        return new Caminhao(ano, preco, potencia, quilometragem, cor, tipoPotencia, modelo,
                combustivel, portas, capacidadeDeCarga);
    }

    public static Moto spyMoto(int ano, int preco, int potencia, int quilometragem, String cor, String tipoPotencia, String modelo,
            String combustivel) {
        return new Moto(ano, preco, potencia, quilometragem, cor, tipoPotencia, modelo,
                combustivel);
    } 
}
