/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula01.Aula01;

/**
 *
 * @author manto
 */
public class Main {
    public static void main(String[] args) {
        MetodoPagamento cartao = new CartaoCreditoPagamento();
        MetodoPagamento paypal = new PayPalPagamento();
        MetodoPagamento pix = new PIXPagamento();
        
        cartao.processaPagamento(100);
        cartao.mostrarDetalhesPagamento();

        paypal.processaPagamento(100);
        paypal.mostrarDetalhesPagamento();

        pix.processaPagamento(100);
        pix.mostrarDetalhesPagamento();
    }
}
