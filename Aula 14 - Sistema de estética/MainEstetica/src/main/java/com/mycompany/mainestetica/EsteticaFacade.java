/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainestetica;

/**
 *
 * @author 55649
 */
public class EsteticaFacade {
    public void agendarServico(Cliente cliente, Servico servico, String dataHora) {
        Agendamento agendamento = new Agendamento(cliente, servico, dataHora);
        agendamento.confirmar();
    }

    public void realizarPagamento(Cliente cliente, Servico servico) {
        Pagamento pagamento = new PagamentoProxy(cliente);
        pagamento.realizarPagamento(servico.preco());
    }
}
