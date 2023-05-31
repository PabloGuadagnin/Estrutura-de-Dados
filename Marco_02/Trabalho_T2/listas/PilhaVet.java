package Marco_02.Trabalho_T2.listas;

import Marco_02.Trabalho_T2.interfaces.IPilha;

public class PilhaVet implements IPilha {

    private Object[] pilha;
    private int numElem;

    public PilhaVet(int tamanhoVetor) { // construtor
        this.pilha = new Object[tamanhoVetor];
        this.numElem = 0;
    }

    public boolean push(Object info) { // empilha
        if (this.numElem == pilha.length) {
            System.out.println("Pilha Estourou");
            return false;
        }
        this.pilha[this.numElem] = info;
        this.numElem++;
        return true;
    }

    public Object pop() { // desempilha
        Object o = null;
        if (this.isEmpty()) {
            System.out.println("Pilha Vazia");
            return null;
        }
        o = this.pilha[numElem - 1];
        this.pilha[numElem - 1] = null;
        this.numElem--;
        return o;
    }

    public Object top() {
        Object o = null;
        if (this.isEmpty()) {
            System.out.println("Pilha Vazia");
            return null;
        }
        o = this.pilha[numElem - 1];
        return o;
    }

    public boolean isEmpty() {
        if (this.numElem == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return this.numElem;
    }

    public void imprimePilha() {
        for (int i = numElem -1; i >= 0; i--) {
            System.out.print(this.pilha[i]);
        }
    }
}
