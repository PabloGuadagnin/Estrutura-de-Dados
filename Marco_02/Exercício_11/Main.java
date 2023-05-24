package Marco_02.Exercício_11;

public class Main {
    public static void main(String[] args) {
        FilaVet fila = new FilaVet(5);

        fila.add(4);
        fila.add(2);
        fila.add(7);
        fila.add("Zé");
        fila.add(28);

        fila.remove();

        fila.add("Jãozinho");

        fila.remove();

        fila.add(123);

        fila.add(9889);

        fila.imprimeFila();
    }
}