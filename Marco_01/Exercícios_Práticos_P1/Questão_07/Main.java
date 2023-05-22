package Exercícios_Práticos_P1.Questão_07;

import Exercícios_Práticos_P1.Questão_07.listas.LSE;

public class Main {
    public static void main(String[] args) throws Exception {

        LSE lista = new LSE();
        lista.insereFim(1);
        lista.insereFim(2);
        lista.insereFim(3);
        lista.insereFim(4);
        lista.insereFim(6);
        lista.insereFim(7);
        lista.insereFim(8);
        
        System.out.println("Elementos: ");
        lista.imprime_rec();
    }
}