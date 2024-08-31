/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainestetica;

/**
 *
 * @author 55649
 */
public class CorteCabelo implements Servico {
    @Override
    public String descricao() {
        return "Corte de Cabelo";
    }

    @Override
    public double preco() {
        return 50.0;
    }
}

