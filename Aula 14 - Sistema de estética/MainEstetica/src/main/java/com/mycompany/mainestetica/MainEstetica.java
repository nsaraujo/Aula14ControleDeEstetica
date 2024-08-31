/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainestetica;

/**
 *
 * @author 55649
 */
public class MainEstetica {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Maria", "12345-6789");
        Servico corteCabelo = new CorteCabelo();
        Servico corteComDesconto = new Desconto(corteCabelo, 10.0); // 10% de desconto

        EsteticaFacade estetica = new EsteticaFacade();
        estetica.agendarServico(cliente, corteComDesconto, "10/09/2024 15:00");
        estetica.realizarPagamento(cliente, corteComDesconto);
        
        Cliente cliente2 = new Cliente("Noro", "4002-8922");
        Servico harmonizacaoFacial = new HarmonizacaoFacial();
        Servico harmonizacaoFacialDesconto = new Desconto(harmonizacaoFacial, 20.0);
        
        EsteticaFacade estetica2 = new EsteticaFacade();
        estetica2.agendarServico(cliente2, harmonizacaoFacial, "25/09/2024  08:00");
        estetica2.realizarPagamento(cliente2, harmonizacaoFacialDesconto);
    }
}
