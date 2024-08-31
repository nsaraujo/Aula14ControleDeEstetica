/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainestetica;

/**
 *
 * @author 55649
 */
public class Desconto extends ServicoDecorator {
    private double percentual;

    public Desconto(Servico servico, double percentual) {
        super(servico);
        this.percentual = percentual;
    }

    @Override
    public double preco() {
        return servico.preco() * (1 - percentual / 100);
    }
}