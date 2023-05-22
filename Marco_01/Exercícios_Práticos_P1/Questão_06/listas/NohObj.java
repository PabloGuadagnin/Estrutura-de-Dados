package Exercícios_Práticos_P1.Questão_06.listas;

public class NohObj {

    private Object obj;
    private NohObj proximo;
    private NohObj anterior;

    public NohObj(Object obj) {
        this.obj = obj;
        this.proximo = null;
        this.anterior = null;
    }

    public Object getInfo() {
        return obj;
    }

    public void setInfo(Object obj) {
        this.obj = obj;
    }

    public NohObj getProximo() {
        return proximo;
    }

    public void setProximo(NohObj proximo) {
        this.proximo = proximo;
    }

    public NohObj getAnterior() {
        return anterior;
    }

    public void setAnterior(NohObj anterior) {
        this.anterior = anterior;
    }
}