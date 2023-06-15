package Marco_03.Exercício_15;

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

        arvore.imprime();

        System.out.println("");
        
        if (arvore.busca(130)) {
            System.out.println("Número existe.");
        }else{
            System.out.println("Número ñ existe.");
        }
    }
}
