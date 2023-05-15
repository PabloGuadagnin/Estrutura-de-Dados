package Exercício_07;

import java.util.Random;

public class Vetor {
    private int vetor[];
    private int totalInteiros = 0;

    public Vetor() {
        this.vetor = new int[1000];
    }

    public void adiciona(int num) {
        this.garanteespaco();
        this.vetor[this.totalInteiros] = num;
        this.totalInteiros++;
    }

    public int tamanho() {
        return this.totalInteiros;
    }

    public boolean contem(int num) {
        for (int i = 0; i < this.totalInteiros; i++) {
            if (num == this.vetor[i]) {
                return true;
            }
        }
        return false;
    }

    public boolean cheio() {
        if (totalInteiros == this.vetor.length) {
            return true;
        }
        return false;
    }

    private void garanteespaco() {
        if (this.cheio()) {
            int novosInteiros[] = new int[this.vetor.length * 2];
            for (int i = 0; i < this.vetor.length; i++) {
                novosInteiros[i] = this.vetor[i];
            }
            this.vetor = novosInteiros;
        }
    }

    public boolean remove(int num) {
        int indice = -1;
        for (int i = 0; i < totalInteiros; i++) { // faz a busca
            if (num == this.vetor[i]) {
                indice = i;
                break;
            }
        }
        if (indice != -1) { // achou o elemento
            for (int i = indice; i < (totalInteiros - 1); i++) {
                vetor[i] = vetor[i + 1];
            }
            totalInteiros--;
            return true;
        }
        return false;
    }

    public int maximoIter() {
        int max = 0;
        for (int i = 0; i < totalInteiros; i++) {
            if (vetor[i] > max) {
                max = vetor[i];
            }
        }
        return max;
    }

    public int maximoRec(int[] vetor, int inicio, int fim) {
        int meio, max1, max2;
        if (inicio == fim) {
            return vetor[inicio];

        } else {
            meio = (inicio + fim) / 2;
            max1 = maximoRec(vetor, inicio, meio);
            max2 = maximoRec(vetor, meio + 1, fim);

            if (max1 > max2) {
                return max1;
            } else {
                return max2;
            }
        }
    }

    public int preencher() {
        return (new Random().nextInt());
    }
}
