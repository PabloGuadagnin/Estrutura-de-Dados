package Exercício_02;

import java.util.Arrays;

public class VetorAluno {

    private Aluno[] alunos;
    private int tamanho;

    public VetorAluno(int tamanho) {
        this.alunos = new Aluno[tamanho];
    }

    public boolean adiciona(Aluno aluno) {
        if (this.tamanho < this.alunos.length) {
            this.alunos[this.tamanho] = aluno;
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
            if (this.alunos[i].getNome().equals(aluno)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vetor de Alunos: " + Arrays.toString(alunos) +
                ", Tamanho: " + tamanho;
    }
}