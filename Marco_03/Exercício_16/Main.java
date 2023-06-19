package Marco_03.Exercício_16;

public class Main {
    public static void main(String[] args) {
        ABB arvore = new ABB();

        arvore.add(100);
        arvore.add(10);
        arvore.add(110);
        arvore.add(200);
        arvore.add(50);
        arvore.add(20);
        arvore.add(130);

        arvore.emOrdem();
        System.out.println("\n");
        arvore.preOrdem();
        System.out.println("\n");
        arvore.posOrdem();
        System.out.println("\n");

        if (arvore.busca(130)) {
            System.out.println("Número existe.");
        } else {
            System.out.println("Número ñ existe.");
        }

        arvore.remove(110);

        arvore.emOrdem();
        System.out.println("\n");
        arvore.preOrdem();
        System.out.println("\n");
        arvore.posOrdem();
        System.out.println("\n");

        if (arvore.busca(110)) {
            System.out.println("Número existe.");
        } else {
            System.out.println("Número ñ existe.");
        }
    }
}
