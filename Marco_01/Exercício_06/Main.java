package Exercício_06;

import Exercício_06.listas.LSE;
import Exercício_06.listas.ListaObj;
import Exercício_06.objetos.Aluno;

public class Main {
    public static void main(String[] args) throws Exception {

        LSE lista = new LSE();
        lista.insereInicio(9999);
        lista.insereInicio(5555);
        lista.insereFim(7777);
        lista.insereFim(1111);
        lista.remove(5555);

        lista.imprimirLista();

        lista.remove(1111);

        System.out.println(lista.contemInfo(5555));
        System.out.println(lista.contemInfo(7777));
        System.out.println(lista.estahVazia());

        LSE lista2 = new LSE();
        System.out.println(lista2.estahVazia());

        lista2.insereFim(1);
        System.out.println(lista2.estahVazia());
        System.out.println(lista.tamanho());

        lista.insereInicio(99);
        lista.insereInicio(65);
        System.out.println(lista.tamanho());

        Aluno aluno1 = new Aluno("Zé", 20, 10);

        ListaObj listaObj = new ListaObj();
        listaObj.insereInicio(aluno1);

        System.out.println("\n" + listaObj.estahVazia());
        System.out.println(listaObj.tamanho());
        listaObj.remove(aluno1);

        System.out.println("\n" + listaObj.tamanho());

    }
}