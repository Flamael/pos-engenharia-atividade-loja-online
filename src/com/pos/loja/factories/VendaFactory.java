/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.loja.factories;

import com.pos.loja.models.Cliente;
import com.pos.loja.models.Venda;

/**
 *
 * @author felip
 */
public class VendaFactory {

    public static Venda spyVenda(Object objectCliente) {
        return new Venda((Cliente) objectCliente);
    }
}
