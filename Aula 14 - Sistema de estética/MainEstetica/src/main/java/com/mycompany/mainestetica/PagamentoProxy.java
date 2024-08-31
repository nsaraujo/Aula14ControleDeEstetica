/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainestetica;

/**
 *
 * @author 55649
 */
public class PagamentoProxy implements Pagamento {
    private PagamentoReal pagamentoReal;
    private Cliente cliente;

    public PagamentoProxy(Cliente cliente) {
        this.cliente = cliente;
        this.pagamentoReal = new PagamentoReal();
    }

    private boolean autenticar() {
        // Simula autenticação
        return cliente.getNome() != null;
    }

    @Override
    public void realizarPagamento(double valor) {
        if (autenticar()) {
            pagamentoReal.realizarPagamento(valor);
        } else {
            System.out.println("Autenticação falhou. Pagamento não realizado.");
        }
    }
}
