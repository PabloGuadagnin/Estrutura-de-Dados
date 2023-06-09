package Marco_02.Exercício_14.listas;

import Marco_02.Exercício_14.interfaces.IFila;

public class Fila implements IFila { // tem funcionamento circular
    private int nElemFila;
    private int inicio;
    private Object[] vetFila;

    public Fila(int tamFila) { // construtor
        this.nElemFila = 0;
        this.inicio = 0;
        this.vetFila = new Object[tamFila];
    }

    public boolean add(Object info) { // método que insere na fila
        if (this.nElemFila == vetFila.length) {
            System.out.println("Capacidade da fila esgotou");
            return false;
        }
        int fim = (this.inicio + this.nElemFila) % this.vetFila.length;
        this.vetFila[fim] = info;
        this.nElemFila++;
        return true;
    }

    public boolean remove() { // método que retira da fila
        if (this.isEmpty()) { // como verificar se está vazia?
            System.out.println("Fila estah vazia");
            return false;
        }
        this.inicio = (this.inicio + 1) % this.vetFila.length;
        this.nElemFila--;
        return true;
    }

    public void imprimeFila() {
        int index = this.inicio;
        for (int i = 0; i < this.nElemFila; i++) {
            System.out.print(this.vetFila[index]);
            index = (index + 1) % this.vetFila.length;
        }
    }

    public boolean isEmpty() {
        if (this.nElemFila == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return this.nElemFila;
    }
}