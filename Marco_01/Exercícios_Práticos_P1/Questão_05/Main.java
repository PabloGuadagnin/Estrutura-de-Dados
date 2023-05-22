package Exercícios_Práticos_P1.Questão_05;

import Exercícios_Práticos_P1.Questão_05.listas.LDE;

public class Main {
    public static void main(String[] args) throws Exception {

        LDE lista = new LDE();
        lista.insereInicio(9999);
        lista.insereInicio(5555);
        lista.insereInicio(6666);
        lista.insereFim(7777);
        lista.insereFim(1111);

        System.out.print("Qtd de elementos pares: "+lista.nroPares());
    }
}