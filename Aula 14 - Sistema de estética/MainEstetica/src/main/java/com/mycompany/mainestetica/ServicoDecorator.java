/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainestetica;

/**
 *
 * @author 55649
 */
public abstract class ServicoDecorator implements Servico {
    protected Servico servico;

    public ServicoDecorator(Servico servico) {
        this.servico = servico;
    }

    @Override
    public String descricao() {
        return servico.descricao();
    }

    @Override
    public double preco() {
        return servico.preco();
    }
}