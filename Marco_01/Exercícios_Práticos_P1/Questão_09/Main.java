package Exercícios_Práticos_P1.Questão_09;

import Exercícios_Práticos_P1.Questão_09.listas.LSE;

public class Main {
    public static void main(String[] args) throws Exception {

        LSE lista = new LSE();
        lista.insereFim(121);
        lista.insereFim(2321);
        lista.insereFim(32);
        lista.insereFim(4);

        lista.bubbleSort();
        
        System.out.println("Elementos ordenados com BubbleSort: ");
        lista.imprimirLista();
    }
}