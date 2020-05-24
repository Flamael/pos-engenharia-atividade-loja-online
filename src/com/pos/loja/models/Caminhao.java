package com.pos.loja.models;

import com.pos.loja.interfaces.Motor;

public class Caminhao extends Automovel implements Motor {

    private int portas;
    private int capacidadeDeCarga;

    public Caminhao(int ano, int preco, int potencia, int quilometragem, String cor, String tipoPotencia, String modelo,
            String combustivel, int portas, int capacidadeDeCarga) {
        super(ano, preco, potencia, quilometragem, cor, tipoPotencia, modelo, combustivel, Automovel.CAMINHAO);

        this.portas = portas;
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    @Override
    public void verificarEstadoDoMotor() {
        System.out.println("O Motor do "+Automovel.CAMINHAO+" está em bom estado ");
    }

    @Override
    public String toString() {
        return Automovel.CAMINHAO + " {"
                + "ano=" + getAno()
                + ", preco=" + getPreco()
                + ", potencia=" + getPotencia()
                + ", quilometragem=" + getQuilometragem()
                + ", cor=" + getCor()
                + ", tipoPotencia=" + getPotencia()
                + ", modelo=" + getModelo()
                + ", combustivel=" + getCombustivel() 
                + ", portas=" + portas
                + ", capacidadeDeCarga=" + capacidadeDeCarga
                + '}';
    }
}
