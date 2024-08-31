/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainestetica;

/**
 *
 * @author 55649
 */
public class PagamentoReal implements Pagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento realizado no valor de R$" + valor + "\n");
    }
}
