/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainestetica;

/**
 *
 * @author 55649
 */
public class Agendamento {
    private Cliente cliente;
    private Servico servico;
    private String dataHora;

    public Agendamento(Cliente cliente, Servico servico, String dataHora) {
        this.cliente = cliente;
        this.servico = servico;
        this.dataHora = dataHora;
    }

    public void confirmar() {
        System.out.println("Agendamento confirmado para " + cliente.getNome() + " no horario: " + dataHora);
    }
}
