package Exercício_09;

public class Main {
    public static void main(String[] args) throws Exception {

        // Cria o vetor com mil posições
        Vetor vetor = new Vetor();
        // popula o vetor de mil posições
        vetor.gerarNumerosAleatorios();

        // Verifica se está populando corretamente
        // System.out.println(vetor.toString());

        // bubble sort
        long inicioBubble = System.nanoTime();
        vetor.bubble_sort();
        long fimBubble = System.nanoTime();
        System.out.println("Tempo de execução Bubble Sort: " + (fimBubble - inicioBubble) + " ns\n");

        // selection_sort
        long inicioSelection = System.nanoTime();
        vetor.selection_sort();
        long fimSelection = System.nanoTime();
        System.out.println("Tempo de execução Selection Sort: " + (fimSelection - inicioSelection) + " ns\n");

        // insertion_sort
        long inicioInsertion = System.nanoTime();
        vetor.insertion_sort();
        long fimInsertion = System.nanoTime();
        System.out.println("Tempo de execução Insertion Sort: " + (fimInsertion - inicioInsertion) + " ns\n");

    }
}