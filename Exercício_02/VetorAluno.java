package Exercício_02;

import java.util.Arrays;

public class VetorAluno {

    private Aluno[] elementos;
    private int tamanho;

    public VetorAluno(int tamanho) {
        this.elementos = new Aluno[tamanho];
        this.tamanho = 0;
    }

    public boolean adiciona(Aluno aluno) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = aluno;
            this.tamanho++;
            return true;
        }

        return false;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public boolean contem(String aluno) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].getNome().equals(aluno)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vetor de Alunos: " + Arrays.toString(elementos) +
                ", Tamanho: " + tamanho;
    }
}