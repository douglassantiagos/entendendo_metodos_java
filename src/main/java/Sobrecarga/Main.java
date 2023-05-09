package Sobrecarga;

import org.example.Calculadora;
import org.example.Emprestimo;
import org.example.Mensagem;

public class Main {
    public static void main(String[] args) {
        // Quadrilatero
        System.out.println("/------------ Exercício Quadrilateto ------------/");

        double areaQuadrado = Quadrilatero_Sobrecarga.area(4);
        System.out.println("Area do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero_Sobrecarga.area(5, 2);
        System.out.println("Area do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero_Sobrecarga.area(5, 9, 2);
        System.out.println("Area do trapézio: " + areaTrapezio);

        System.out.println("\n");
    }
}