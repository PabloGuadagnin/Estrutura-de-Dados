package Marco_02.Exercício_13.listas;

import Marco_02.Exercício_13.interfaces.IPilha;

public class PilhaLista implements IPilha {
    private NohObj topo;

    public PilhaLista() { // construtor
        this.topo = null;
    }

    public boolean push(Object info) { // empilha
        NohObj novo = new NohObj(info);
        if (this.isEmpty())
            topo = novo;
        else {
            novo.setProximo(topo);
            topo = novo;
        }
        return true;
    }

    public Object pop() { // desempilha
        Object info = null;
        if (!this.isEmpty()) {
            info = topo.getInfo();
            topo = topo.getProximo();
        }
        return info;
    }

    public Object top() {
        Object info = null;
        if (!this.isEmpty()) {
            info = topo.getInfo();
        }
        return info;
    }

    public boolean isEmpty() {
        if (topo != null)
            return false;
        return true;
    }

    public int size() {
        NohObj aux = topo;
        int tamanho = 0;

        if (!this.isEmpty()) {
            while (aux != null) {
                tamanho += 1;
                aux = aux.getProximo();
            }
        }
        return tamanho;
    }
}