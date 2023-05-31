package Marco_02.Trabalho_T2.listas;

public class Noh {

    private int info;
    private Noh proximo;
    private Noh anterior;

    public Noh(int info) {
        this.info = info;
        this.proximo = null;
        this.anterior = null;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Noh getProximo() {
        return proximo;
    }

    public void setProximo(Noh proximo) {
        this.proximo = proximo;
    }

    public Noh getAnterior() {
        return anterior;
    }

    public void setAnterior(Noh anterior) {
        this.anterior = anterior;
    }
}