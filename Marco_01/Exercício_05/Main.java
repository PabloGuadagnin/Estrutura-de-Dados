package Exercício_05;

public class Main {
    public static void main(String[] args) throws Exception {
        Lista lista1 = new LSE();

        lista1.insereInicio(2367267);
        lista1.insereInicio(90909);
        lista1.insereFim(909090);
        lista1.insereFim(7272772);
        lista1.insereFim(45678);

        lista1.imprimeLista();

        System.out.println("Tamanho: " + lista1.tamanho());
        System.out.println();

        lista1.remove(2367267);

        lista1.imprimeLista();

        System.out.println("Tamanho: " + lista1.tamanho());
    }
}