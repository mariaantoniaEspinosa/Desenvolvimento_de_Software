/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula01.Aula01;

/**
 *
 * @author manto
 */
public class PIXPagamento extends MetodoPagamento{
    
    public PIXPagamento(){
        super("PIX");
    }
    @Override
    public void processaPagamento(double valor){
        System.out.printf("Gerando qrCode para pagamento de %.2f via %s%n", valor, nomeMetodo);
        System.out.println("Pagamento processado");
    }
    
    @Override
    public void mostrarDetalhesPagamento(){
        System.out.println("Detalhes do pagamento");
        System.out.println("Metodo: " + nomeMetodo);
        System.out.println("Id do pagamento: " + idPagamento);
    }
}
