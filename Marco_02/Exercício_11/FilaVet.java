package Marco_02.Exercício_11;

import java.util.Arrays;

public class FilaVet implements IFila { // tem funcionamento circular
    private int nElemFila;
    private int inicio;
    private Object[] vetFila;

    public FilaVet(int tamFila) { // construtor
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
        System.out.println(Arrays.toString(vetFila));
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