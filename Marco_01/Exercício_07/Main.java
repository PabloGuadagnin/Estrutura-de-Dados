package Exercício_07;

public class Main {
    public static void main(String[] args) {
        Vetor vet = new Vetor();
        int vetor[] = new int[1000];

        for (int i = 0; i < vetor.length - 1; i++) {
            vet.adiciona(vetor[i] = vet.preencher());
        }

        // Recursivo
        double inicio = System.nanoTime();
        for (int i = 0; i < vetor.length - 1; i++) {
            vet.maximoRec(vetor, 0, vet.tamanho());
        }
        double tempoRec = (System.nanoTime() - inicio);
        System.out.println("Tempo Recursivo: " + tempoRec);

        // Iterativo
        double inicio2 = System.nanoTime();
        for (int i = 0; i < vetor.length - 1; i++) {
            vet.maximoIter();
        }
        double tempoIt = (System.nanoTime() - inicio2);
        System.out.println("Tempo Iterativo: " + tempoIt);

        // Comparação
        if (tempoRec < tempoIt) {
            System.out.println("Modo recursivo é mais rápido.");
        } else {
            System.out.println("Modo iterativo é mais rápido.");
        }

    }
}