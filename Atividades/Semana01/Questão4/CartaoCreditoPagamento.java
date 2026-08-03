/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula01.Aula01;

/**
 *
 * @author manto
 */
public class CartaoCreditoPagamento extends MetodoPagamento{

    public CartaoCreditoPagamento() {
        super("Cartao de Credito");
    }

    @Override
    public void processaPagamento(double valor) {
        System.out.printf("Processando pagamento de %.2f - %s%n", valor, nomeMetodo);
        System.out.println("Pagamento confirmado");
    }

    @Override
    public void mostrarDetalhesPagamento() {
        System.out.println("Detalhes do pagamento");
        System.out.println("Metodo: " + nomeMetodo);
        System.out.println("Id pagamento: " + idPagamento);
    }
    
}
