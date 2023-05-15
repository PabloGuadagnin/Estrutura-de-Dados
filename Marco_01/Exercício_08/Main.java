package Exercício_08;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor();
        int vetorAleatorio[] = vetor.gerarNumerosAleatorios();
        Random rand = new Random();
        int valor = rand.nextInt(9999);

        // Recursiva

        System.out.println("Recursiva");
        long inicioBuscaRec = System.nanoTime();
        boolean buscaRec = vetor.buscaRecursiva(vetorAleatorio, 0, vetorAleatorio.length - 1, valor);
        long fimbuscaRec = System.nanoTime();

        System.out.println("Buscando: " + valor);

        if (buscaRec) {
            System.out.println("Numero encontrado");
        } else {
            System.out.println("Numero não encontrado");
        }

        System.out.println("Tempo de execução: " + (fimbuscaRec - inicioBuscaRec) + "\n");

        // Iterativa

        long inicioBusca = System.nanoTime();
        boolean busca = vetor.buscaBinaria(valor);
        long fimbusca = System.nanoTime();

        System.out.println("Iterativa");

        if (busca) {
            System.out.println("Numero encontrado");
        } else {
            System.out.println("Numero não encontrado");
        }

        System.out.println("Tempo de execução: " + (fimbusca - inicioBusca) + "\n");

        if ((fimbuscaRec - inicioBuscaRec) < (fimbusca - inicioBusca)) {
            System.out.println("Busca Recursiva é mais rápida.");
        } else {
            System.out.println("Busca itertiva é mais rápida.");
        }
    }
}