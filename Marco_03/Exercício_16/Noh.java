package Marco_03.Exercício_16;

public class Noh {
    int valor;
    Noh esq;
    Noh dir;
    Noh pai;

    Noh(int v) {
        this.valor = v;
        this.pai = null;
        this.esq = null;
        this.dir = null;
    }
}