package Exercícios_Práticos_P1.Questão_08.listas;

import Exercício_06.interfaces.ILista;

public class LSE implements ILista {

    private Noh inicio;

    public LSE() {
        this.inicio = null;
    }

    public void insereInicio(int info) {

        Noh novo = new Noh(info);
        if (inicio == null)
            inicio = novo;
        else {
            novo.setProximo(inicio);
            inicio = novo;
        }
    }

    public void insereFim(int info) {

        Noh novo = new Noh(info);
        if (inicio == null)
            inicio = novo;
        else {
            Noh ultimo = null;
            for (Noh i = inicio; i != null; i = i.getProximo())
                ultimo = i;
            ultimo.setProximo(novo);
        }
    }

    public boolean remove(int info) {

        Noh ant = null, p;
        p = inicio;

        while (p != null && p.getInfo() != info) {
            ant = p;
            p = p.getProximo();
        }

        if (p == null)
            return false;
        if (ant == null)
            inicio = p.getProximo();
        else
            ant.setProximo(p.getProximo());

        return true;
    }

    public void imprimirLista() {
        Noh aux = inicio;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getProximo();
        }
    }

    public boolean contemInfo(int info) {
        Noh aux = inicio;
        while (aux != null) {
            if (aux.getInfo() == info)
                return true;
            aux = aux.getProximo();
        }
        return false;
    }

    public boolean estahVazia() {
        if (inicio != null)
            return false;
        return true;
    }

    public int tamanho() {
        Noh aux = inicio;
        int tamanho = 0;

        if (!this.estahVazia()) {
            while (aux != null) {
                tamanho += 1;
                aux = aux.getProximo();
            }
        }
        return tamanho;
    }

    public void imprime_rec() {
        imprime_rec(inicio);
    }

    private void imprime_rec(Noh node) {
        if (node == null) {
            return;
        }

        System.out.println(node.getInfo());

        imprime_rec(node.getProximo());
    }

}