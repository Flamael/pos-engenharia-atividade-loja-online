/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.loja.utils;

import static com.pos.loja.utils.Mock.automoveis;
import java.util.Random;

/**
 *
 * @author felipe
 */
public class GeradorDeNumeros {

    public static int getNumeroAleatorio(int tamanhoMaximo) {
        return new Random().nextInt(tamanhoMaximo - 1);
    }
}
