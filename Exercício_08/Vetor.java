package Exercício_08;

import java.util.Random;

public class Vetor {
    private int tamanho;
    private int[] lista;

    // Construtor da classe, recebe o tamanho do vetor como parâmetro
    public Vetor(int tamanho) {
        this.tamanho = tamanho;
        this.lista = new int[tamanho];

        // Preenche o vetor com números inteiros aleatórios entre 0 e 1000
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            this.lista[i] = random.nextInt(1000);
        }
    }

    // Getter para acessar um elemento do vetor pelo índice
    public int get(int index) {
        return this.lista[index];
    }

    // Setter para alterar um elemento do vetor pelo índice
    public void set(int index, int valor) {
        this.lista[index] = valor;
    }

    // Getter para retornar o tamanho do vetor
    public int tamanho() {
        return this.tamanho;
    }

    // Método recursivo para encontrar o maior elemento do vetor
    public int maiorElementoRecursivo(int inicio, int fim) {
        if (inicio == fim) {
            // Se o intervalo contém apenas um elemento, esse é o maior
            return this.get(inicio);
        }

        // Divide o intervalo em duas partes e encontra o maior elemento de cada uma
        int meio = (inicio + fim) / 2;
        int maxEsquerda = this.maiorElementoRecursivo(inicio, meio);
        int maxDireita = this.maiorElementoRecursivo(meio + 1, fim);

        // Retorna o maior elemento encontrado nas duas partes
        return Math.max(maxEsquerda, maxDireita);
    }

    // Método iterativo para encontrar o maior elemento do vetor
    public int maiorElementoIterativo() {
        int max = this.get(0);
        for (int i = 1; i < this.tamanho(); i++) {
            // Percorre o vetor e compara cada elemento com o maior encontrado até então
            if (this.get(i) > max) {
                max = this.get(i);
            }
        }
        // Retorna o maior elemento encontrado
        return max;
    }

    public static void main(String[] args) {
        Vetor vetor = new Vetor(1000);

        // Teste do método recursivo
        long inicioRecursivo = System.nanoTime();
        int maxRecursivo = vetor.maiorElementoRecursivo(0, vetor.tamanho() - 1);
        long fimRecursivo = System.nanoTime();
        System.out.println("Maior elemento (recursivo): " + maxRecursivo);
        System.out.println("Tempo de execução (recursivo): " + (fimRecursivo - inicioRecursivo) + " ns");

        // Teste do método iterativo
        long inicioIterativo = System.nanoTime();
        int maxIterativo = vetor.maiorElementoIterativo();
        long fimIterativo = System.nanoTime();
        System.out.println("Maior elemento (iterativo): " + maxIterativo);
        System.out.println("Tempo de execução (iterativo): " + (fimIterativo - inicioIterativo) + " ns");
    }
}
