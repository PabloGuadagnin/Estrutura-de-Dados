package Exercícios_Práticos_P1.Questão_06;

import Exercícios_Práticos_P1.Questão_06.listas.LDE;

public class Main {
    public static void main(String[] args) throws Exception {

        LDE lista = new LDE();
        lista.insereFim(1);
        lista.insereFim(2);
        lista.insereFim(3);
        lista.insereFim(4);
        lista.insereFim(6);
        lista.insereFim(7);
        lista.insereFim(8);
        lista.add_ordenado(5);
        
        System.out.println("Elementos ordenados: ");
        lista.imprimeDoInicio();
    }
}

/*
 * 
 * A maior complexidade se dá caso o elemento a ser inserido for o maior valor da lista.
 * 
 */