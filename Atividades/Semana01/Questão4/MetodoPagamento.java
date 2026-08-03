/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula01.Aula01;

import java.util.Random;

/**
 *
 * @author manto
 */
abstract class MetodoPagamento {
    protected String nomeMetodo;
    protected int idPagamento;
    
    public MetodoPagamento(String nomeMetodo){
        this.nomeMetodo = nomeMetodo;
        Random random = new Random();
        this.idPagamento = 1000 + random.nextInt(9000);
    }

    public String getNomeMetodo() {
        return nomeMetodo;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }
    
    public abstract void processaPagamento(double valor);
    public abstract void mostrarDetalhesPagamento();
}
