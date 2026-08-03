/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao05;

/**
 *
 * @author manto
 */
public class Calculadora implements ICalculadora{
    @Override
    public double somar(double n1, double n2) {
        return n1 + n2;
    }

    @Override
    public double subtrair(double n1, double n2) {
        return n1 - n2;
    }

    @Override
    public double multiplicar(double n1, double n2) {
        return n1 * n2;
    }

    @Override
    public double dividir(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("Erro: divisão por zero!");
            return 0;
        }
        return n1 / n2;
    }

    @Override
    public double raizQuadrada(double n1, double n2) {
        return Math.sqrt(n1);
    }

    @Override
    public double elevarPotencia(double n1, double n2) {
        return Math.pow(n1, n2);
    }

    @Override
    public double logaritmo10(double n1) {
        return Math.log10(n1);
    }
}
