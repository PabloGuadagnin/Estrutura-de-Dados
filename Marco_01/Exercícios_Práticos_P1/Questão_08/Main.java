package Exercícios_Práticos_P1.Questão_08;

import Exercícios_Práticos_P1.Questão_08.listas.LDE;

public class Main {
    public static void main(String[] args) throws Exception {

        LDE lista = new LDE();
        LDE lista2 = new LDE();
        lista.insereFim(1);
        lista.insereFim(2);
        lista.insereFim(3);
        lista.insereFim(4);

        lista2.insereFim(6);
        lista2.insereFim(7);
        lista2.insereFim(8);

        lista.concat(lista2);
        
        System.out.println("Elementos concatenados: ");
        lista.imprimeDoInicio();
    }
}