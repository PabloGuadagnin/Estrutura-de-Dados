package Marco_02.Trabalho_T2;

import Marco_02.Trabalho_T2.listas.Fila;
import Marco_02.Trabalho_T2.listas.PilhaVet;
import Marco_02.Trabalho_T2.objetos.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("José", 9.5, 19);
        Aluno aluno2 = new Aluno("Camila", 6.5, 20);
        Aluno aluno3 = new Aluno("Hugo", 4.5, 21);

        Fila fila = new Fila(3);

        fila.add(aluno1);
        fila.add(aluno2);
        fila.add(aluno3);

        System.out.println("Fila: ");
        fila.imprimeFila();
        System.out.println("");

        PilhaVet pilha = new PilhaVet(3);

        System.out.print("Pilha está vazia? ");
        if (pilha.isEmpty()) {
            System.out.println("Pilha vazia.");
        } else {
            System.out.println("Pilha populada.");
        }

        pilha.push(aluno1);
        pilha.push(aluno2);
        pilha.push(aluno3);

        System.out.println("");

        System.out.println("Pilha: ");
        pilha.imprimePilha(); // Imprime a pilha (ordem inversa a impressão da fila)

        System.out.println("");

        System.out.print("Pilha está vazia? ");
        if (pilha.isEmpty()) {
            System.out.println("Pilha vazia.");
        } else {
            System.out.println("Pilha populada.");
        }

        System.out.println("");
        pilha.pop();

        System.out.println("Pilha com um Pop: ");
        pilha.imprimePilha(); // Imprime a pilha (ordem inversa a impressão da fila)

        System.out.println("");

        pilha.pop();

        System.out.println("Pilha com dois Pop: ");
        pilha.imprimePilha(); // Imprime a pilha (ordem inversa a impressão da fila)

        System.out.println("");

        pilha.pop();
        pilha.pop();
    }
}
