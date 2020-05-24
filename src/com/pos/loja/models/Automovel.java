package com.pos.loja.models;

public abstract class Automovel {

    private int ano;
    private int preco;
    private int potencia;
    private int quilometragem;
    private String cor;
    private String tipoPotencia;
    private String modelo;
    private String combustivel;
    private String tipo;

    static final String MOTO = "moto";
    static final String CARRO = "carro";
    static final String CAMINHAO = "caminhao";

    Automovel(int ano, int preco, int potencia, int quilometragem, String cor, String tipoPotencia, String modelo,
            String combustivel, String tipo) {
        this.ano = ano;
        this.preco = preco;
        this.potencia = potencia;
        this.quilometragem = quilometragem;
        this.cor = cor;
        this.tipoPotencia = tipoPotencia;
        this.modelo = modelo;
        this.combustivel = combustivel;
        
    }

    public int getAno() {
        return ano;
    }

    public int getPreco() {
        return preco;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public String getCor() {
        return cor;
    }

    public String getTipoPotencia() {
        return tipoPotencia;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public String getTipo() {
        return tipo;
    }

    public static String getMOTO() {
        return MOTO;
    }

    public static String getCARRO() {
        return CARRO;
    }

    public static String getCAMINHAO() {
        return CAMINHAO;
    } 
  
     

}
