package Marco_02.Exercício_12;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("José", 9.5, 19);
        Aluno aluno2 = new Aluno("Camila", 6.5, 20);
        Aluno aluno3 = new Aluno("Hugo", 4.5, 21);

        Fila fila = new Fila(3);

        fila.add(aluno1);
        fila.add(aluno2);
        fila.add(aluno3);

        fila.remove();

        System.out.println("Tamanho: " + fila.size());

        System.out.print("Vazia? ");
        if (fila.isEmpty()) {
            System.out.println("Fila vazia.");
        } else {
            System.out.println("Fila populada.");
        }

        fila.add(aluno1);
        System.out.println("Tamanho: " + fila.size());

        fila.imprimeFila();
    }
}
