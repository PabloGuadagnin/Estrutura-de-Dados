package Exercício_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os Valores A (x, y):");
        double xA = scanner.nextDouble();
        double yA = scanner.nextDouble();
        
        System.out.println("Digite os Valores B (x, y):");
        double xB = scanner.nextDouble();
        double yB = scanner.nextDouble();

        PontoCartesiano cartesiano = new PontoCartesiano(xA, yA, xB, yB);
        
        System.out.println("A distância entre os pontos A e B é: " + cartesiano.calcularDistanciaEuclidiana());
        
        scanner.close();
    }
}