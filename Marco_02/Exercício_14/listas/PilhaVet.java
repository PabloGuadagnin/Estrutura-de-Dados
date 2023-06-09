package Marco_02.Exercício_14.listas;

import Marco_02.Exercício_14.interfaces.IPilha;

public class PilhaVet implements IPilha {

    private Object[] pilha;
    private int numElem;

    public PilhaVet(int tamanhoVetor) { // construtor
        this.pilha = new Object[tamanhoVetor];
        this.numElem = 0;
    }

    public boolean push(Object info) { // empilha
        if (this.numElem == pilha.length) {
            System.out.println("Pilha Estourou");
            return false;
        }
        this.pilha[this.numElem] = info;
        this.numElem++;
        return true;
    }

    public Object pop() { // desempilha
        Object o = null;
        if (this.isEmpty()) {
            System.out.println("Pilha Vazia, Pop desnecessário.");
            return null;
        }
        o = this.pilha[numElem - 1];
        this.pilha[numElem - 1] = null;
        this.numElem--;
        return o;
    }

    public Object top() {
        Object o = null;
        if (this.isEmpty()) {
            System.out.println("Pilha Vazia");
            return null;
        }
        o = this.pilha[numElem - 1];
        return o;
    }

    public boolean isEmpty() {
        if (this.numElem == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return this.numElem;
    }

    public void imprimePilha() {
        for (int i = numElem - 1; i >= 0; i--) {
            System.out.print(this.pilha[i]);
        }
    }

    public boolean ehPalindromo(String palavra) {
        PilhaVet pilha = new PilhaVet(palavra.length()); // Cria uma instância da classe PilhaVet com tamanho igual ao
                                                         // comprimento da palavra
        for (char letra : palavra.toCharArray()) { // Percorre cada caractere da palavra
            pilha.push(letra); // Empilha cada caractere na pilha
        }
        StringBuilder palavraInvertida = new StringBuilder(); // Cria um StringBuilder para construir a palavra
                                                              // invertida
        while (!pilha.isEmpty()) { // Enquanto a pilha não estiver vazia
            palavraInvertida.append(pilha.pop()); // Desempilha cada caractere e adiciona ao StringBuilder para
                                                  // construir a palavra invertida
        }
        return palavra.equals(palavraInvertida.toString()); // Retorna true se a palavra original for igual à palavra
                                                            // invertida, caso contrário, retorna false
    }
}
