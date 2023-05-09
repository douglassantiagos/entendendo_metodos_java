package org.example;

import Sobrecarga.Quadrilatero_Sobrecarga;

public class Main {
    public static void main(String[] args) {
        // Calculadora
        System.out.println("/------------ Exercício Calculadora -----------/");
        Calculadora.soma(15, 6);
        Calculadora.subtracao(20, 18);
        Calculadora.multiplicacao(8, 8);
        Calculadora.divisao(120, 3);
        System.out.println("\n");

        // Mensagem
        System.out.println("/------------ Exercício Mensagem --------------/");
        Mensagem.obterMensagem(7);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(18);
        System.out.println("\n");

        // Emprestimo
        System.out.println("/------------ Exercício Emprestimo ------------/");
        Emprestimo.calcularEmprestimo(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcularEmprestimo(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcularEmprestimo(1000, 3);
        Emprestimo.calcularEmprestimo(1000, 4);
        System.out.println("\n");

        // Quadrilatero
        System.out.println("/------------ Exercício Quadrilareto ------------/");
        Quadrilatero_Sobrecarga.area(4);
        Quadrilatero_Sobrecarga.area(5, 2);
        Quadrilatero_Sobrecarga.area(5, 9, 2);
        System.out.println("\n");
    }
}