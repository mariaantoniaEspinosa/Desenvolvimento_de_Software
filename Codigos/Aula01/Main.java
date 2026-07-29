/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula1revisao;

/**
 *
 * @author hermes
 */
public class Main {

    public static void main(String[] args) {
        
        
        var conta = new ContaCorrente(1000);
        conta.definirSaldoInicial(1000);
        conta.depositar(50);
        conta.sacar(600);
        
        if(conta.sacar(100)) {
            System.out.println("Saque efetuado");
        }
        
        System.out.println("Saldo :" + conta.getSaldo());
    }
}
