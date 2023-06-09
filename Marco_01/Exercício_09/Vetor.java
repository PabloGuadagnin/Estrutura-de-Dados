package Exercício_09;

import java.util.Arrays;
import java.util.Random;

public class Vetor {

    private int[] vetor = new int[1000];
    private int nextIndex = 0;
    private int inicio;
    private int meio;
    private int fim;
    private int max1, max2;

    public Vetor() {
    }

    public Vetor(int i) {
        vetor = new int[i];
    }

    public int getNumero(int index) {
        return vetor[index];
    }

    public void Adiciona(int numero) {
        if (nextIndex == vetor.length) {
            return;
        }

        vetor[nextIndex] = numero;
        nextIndex++;
    }

    public int Tamanho() {
        return nextIndex;
    }

    public boolean Contem(int numero) {
        for (int i = 0; i < nextIndex; i++) {
            if (vetor[i] == numero) {
                return true;
            }

        }
        return false;
    }

    public int maximoRecusao(int vetor[], int inicio, int fim) {
        if (inicio == fim) {
            return vetor[inicio];
        } else {
            meio = (inicio + fim) / 2;
            max1 = maximoRecusao(vetor, inicio, meio);
            max2 = maximoRecusao(vetor, meio + 1, fim);
            if (max1 > max2) {
                return max1;
            } else {
                return max2;
            }
        }
    }

    @Override
    public String toString() {
        return "Vetor: " + Arrays.toString(vetor);
    }

    public int maximoIteracao() {
        int maior = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    public int[] gerarNumerosAleatorios() {
        Random rand = new Random();
        for (int i = 0; i < 1000; i++) {
            this.Adiciona(rand.nextInt(9999));
        }
        return vetor;
    }

    public void listarVetor() {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
            ;
        }
    }

    public boolean buscaBinaria(int valor) {
        Arrays.sort(vetor);
        inicio = 0;
        fim = vetor.length - 1;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (vetor[meio] == valor) {
                return true;
            } else if (vetor[meio] > valor) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return false;
    }

    public boolean buscaRecursiva(int vetor[], int inicio, int fim, int valor) {
        Arrays.sort(vetor);
        if (inicio > fim) {
            return false;
        }
        meio = (inicio + fim);
        if (vetor[meio] == valor) {
            return true;
        } else if (vetor[meio] > valor) {
            return (buscaRecursiva(vetor, inicio, meio - 1, valor));
        } else {
            return (buscaRecursiva(vetor, meio + 1, fim, valor));
        }
    }

    public void bubble_sort() {
        for (int i = 0; i < this.Tamanho(); i++)
            for (int j = 0; j < this.Tamanho() - 1; j++)
                if (this.vetor[j] > this.vetor[j + 1]) {
                    int aux = this.vetor[j];
                    this.vetor[j] = this.vetor[j + 1];
                    this.vetor[j + 1] = aux;
                }
    }

    public void selection_sort() {
        for (int i = 0; i < this.Tamanho(); i++) {
            int menor = i;
            for (int j = i + 1; j < this.Tamanho(); j++)
                if (this.vetor[j] < this.vetor[menor])
                    menor = j;
            int aux = vetor[i];
            this.vetor[i] = this.vetor[menor];
            this.vetor[menor] = aux;
        }
    }

    public void insertion_sort() {
        for (int i = 1; i < this.Tamanho(); i++) {
            int chave = this.vetor[i];
            int j = i - 1;
            while (j >= 0 && chave < this.vetor[j]) {
                this.vetor[j + 1] = this.vetor[j];
                j--;
            }
            this.vetor[j + 1] = chave;
        }
    }
}