package Exercícios_Práticos_P1.Questão_08.listas;

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
        int pares = 0;
        Noh aux = inicio;
        while (aux != null) {
            if (aux.getInfo() % 2 == 0) {
                pares++;
            }
            aux = aux.getProximo();
        }
        return pares;
    }

    public void add_ordenado(int info) {
        Noh novoNoh = new Noh(info);

        if (inicio == null) {
            inicio = novoNoh;
            fim = novoNoh;

        } else if (info < inicio.getInfo()) {
            novoNoh.setProximo(inicio);
            inicio.setAnterior(novoNoh);
            inicio = novoNoh;

        } else if (info > fim.getInfo()) {
            novoNoh.setAnterior(fim);
            fim.setProximo(novoNoh);
            fim = novoNoh;

        } else {
            Noh a = inicio;

            while (a != null && a.getInfo() < info) {
                a = a.getProximo();
            }

            novoNoh.setProximo(a);
            novoNoh.setAnterior(a.getAnterior());

            a.getAnterior().setProximo(novoNoh);
            a.setAnterior(novoNoh);
        }
    }

    public void concat(LDE lista2) {
        Noh aux = lista2.inicio;
        while (aux != null) {
            this.insereFim(aux.getInfo());
            aux = aux.getProximo();
        }
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