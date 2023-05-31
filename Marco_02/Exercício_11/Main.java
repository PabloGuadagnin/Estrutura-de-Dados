package Marco_02.Exercício_11;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(5);

        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(4);
        fila.add(5);

        fila.remove();
        fila.remove();

        fila.add(6);
        fila.add(7);
        fila.add(8);

        System.out.println("Tamanho: " + fila.size());

        System.out.print("Vazia? ");
        if (fila.isEmpty()) {
            System.out.println("Fila vazia.");
        } else {
            System.out.println("Fila populada.");
        }

        fila.imprimeFila();
    }
}