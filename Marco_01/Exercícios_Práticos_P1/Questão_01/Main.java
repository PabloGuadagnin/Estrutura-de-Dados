import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Tamanho dos vetores ? ");
        int x = entrada.nextInt();

        int[] vetor1 = new int[x];
        int[] vetor2 = new int[x];
        int[] vetor3 = new int[x];

        for (int i = 0; i < x; i++) {
            System.out.print("Digite o " + (i + 1) + "º número do Vetor 1: ");
            vetor1[i] = entrada.nextInt();
        }

        System.out.println("");
        for (int i = 0; i < x; i++) {
            System.out.print("Digite o " + (i + 1) + "º número do Vetor 2: ");
            vetor2[i] = entrada.nextInt();
        }

        int aux = 0;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (vetor1[i] == vetor2[j]) {
                    vetor3[aux] = vetor1[i];
                    aux++;
                }
            }
        }

        System.out.println("");
        System.out.println("Intersecção: ");
        for (int i = 0; i < aux; i++) {
            System.out.print("Número: ");
            System.out.print(vetor3[i]);
            System.out.println("");
        }

        entrada.close();
    }
}
