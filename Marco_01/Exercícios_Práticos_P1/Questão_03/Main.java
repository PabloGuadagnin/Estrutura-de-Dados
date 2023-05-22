package Exercícios_Práticos_P1.Questão_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a posição fibonacci você deseja saber: ");
        int n = entrada.nextInt();

        System.out.print("Na " + n + "ª posição o número é: " + fibo(n));

        entrada.close();
    }

    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}