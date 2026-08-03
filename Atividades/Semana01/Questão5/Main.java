/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao05;

/**
 *
 * @author manto
 */
public class Main {
    public static void main(String[] args) {
        ICalculadora calc = new Calculadora();
        
        System.out.println("Soma: " + calc.somar(10, 5));
        System.out.println("Subtração: " + calc.subtrair(10, 5));
        System.out.println("Multiplicação: " + calc.multiplicar(10, 5));
        System.out.println("Divisão: " + calc.dividir(10, 5));
        System.out.println("Raiz quadrada: " + calc.raizQuadrada(25, 0));
        System.out.println("Potência: " + calc.elevarPotencia(2, 3));
        System.out.println("Log base 10: " + calc.logaritmo10(100));
    }
}
