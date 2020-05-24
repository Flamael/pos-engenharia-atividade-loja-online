package com.pos.loja.models;

import com.pos.loja.interfaces.Motor;

public class Moto extends Automovel implements Motor {

    public Moto(int ano, int preco, int potencia, int quilometragem, String cor, String tipoPotencia, String modelo,
            String combustivel) {
        super(ano, preco, potencia, quilometragem, cor, tipoPotencia, modelo, combustivel, Automovel.MOTO);

    }

    @Override
    public void verificarEstadoDoMotor() {
        System.out.println("O Motor da " + Automovel.MOTO + " está em bom estado");
    }

    @Override
    public String toString() {
        return Automovel.MOTO + " {"
                + "ano=" + getAno()
                + ", preco=" + getPreco()
                + ", potencia=" + getPotencia()
                + ", quilometragem=" + getQuilometragem()
                + ", cor=" + getCor()
                + ", tipoPotencia=" + getPotencia()
                + ", modelo=" + getModelo()
                + ", combustivel=" + getCombustivel()
                + '}';
    }

}
