package Exercício_04;

public class Noh<T> {
    private T info;
    private Noh proximo;

    public Noh(T info) {
        this.info = info;
        this.proximo = null;
    }

    public T getInfo() {
        return this.info;
    }

    public Noh getProximo() {
        return this.proximo;
    }

    public void setProximo(Noh n) {
        this.proximo = n;
    }

}