package Exercícios_Práticos_P1.Questão_05.listas;

import Exercício_06.interfaces.ILista;

public class LDE implements ILista {

    private Noh inicio;
    private Noh fim;

    public LDE() {
        this.inicio = null;
        this.fim = null;
    }

    public void insereInicio(int info) {
        Noh novo = new Noh(info);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setProximo(inicio);
            inicio.setAnterior(novo);
            inicio = novo;
        }
    }

    public void insereFim(int info) {
        Noh novo = new Noh(info);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setAnterior(fim);
            fim.setProximo(novo);
            fim = novo;
        }
    }

    public void imprimeDoInicio() {
        Noh aux = inicio;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getProximo();
        }
    }

    public void imprimeDoFim() {
        Noh aux = fim;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getAnterior();
        }
    }

    public int nroPares() {
        int even = 0;
        Noh aux = inicio;
        while (aux != null) {
            if (aux.getInfo() % 2 == 0) {
                even++;
            }
            aux = aux.getProximo();
        }
        return even;
    }

    @Override
    public boolean estahVazia() {
        return false;
    }

    @Override
    public boolean remove(int info) {
        return false;
    }

    public int tamanho() {
        return 0;
    }
}