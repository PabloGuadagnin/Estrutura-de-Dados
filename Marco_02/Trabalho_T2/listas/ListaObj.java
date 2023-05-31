package Marco_02.Trabalho_T2.listas;

import Exercício_06.interfaces.IListaObj;

public class ListaObj implements IListaObj {

    private NohObj inicio;
    private NohObj fim;

    public ListaObj() {
        this.inicio = null;
        this.fim = null;
    }

    public void insereInicio(Object ob) {
        NohObj novo = new NohObj(ob);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setProximo(inicio);
            inicio.setAnterior(novo);
            inicio = novo;
        }
    }

    public void insereFim(Object ob) {
        NohObj novo = new NohObj(ob);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setAnterior(fim);
            fim.setProximo(novo);
            fim = novo;
        }
    }

    public boolean estahVazia() {
        if (inicio != null)
            return false;
        return true;
    }

    public boolean remove(Object ob) {
        NohObj p = inicio;

        while (p != null && p.getInfo() != ob) {
            p = p.getProximo();
        }

        if (p == null)
            return false;
        if (p == inicio) {
            inicio = p.getProximo();
            if (inicio != null)
                inicio.setAnterior(null);
            else
                fim = null;
        } else if (p.getProximo() == null) {
            p.getAnterior().setProximo(null);
            fim = p.getAnterior();

        } else {
            p.getAnterior().setProximo(p.getProximo());
            p.getProximo().setAnterior(p.getAnterior());
        }

        return true;
    }

    public int tamanho() {
        NohObj aux = inicio;
        int tamanho = 0;

        if (!this.estahVazia()) {
            while (aux != null) {
                tamanho += 1;
                aux = aux.getProximo();
            }
        }
        return tamanho;
    }
}