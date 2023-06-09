package Marco_02.Exercício_14;

import Marco_02.Exercício_14.listas.MapaHashLSE;
import Marco_02.Exercício_14.objetos.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(736435217, "José", 9.5, 19);
        Aluno aluno2 = new Aluno(879995247, "Camila", 6.5, 20);
        Aluno aluno3 = new Aluno(524109227, "Hugo", 4.5, 21);
        Aluno aluno4 = new Aluno(123456789, "Ana", 8.0, 18);
        Aluno aluno5 = new Aluno(987654321, "Pedro", 7.2, 22);
        Aluno aluno6 = new Aluno(654987321, "Mariana", 6.8, 19);
        Aluno aluno7 = new Aluno(456123789, "Lucas", 9.0, 21);
        Aluno aluno8 = new Aluno(789456123, "Isabela", 5.5, 20);
        Aluno aluno9 = new Aluno(321654987, "Gustavo", 7.9, 19);
        Aluno aluno10 = new Aluno(654321987, "Laura", 6.2, 18);
        Aluno aluno11 = new Aluno(951753852, "Rafael", 8.5, 20);
        Aluno aluno12 = new Aluno(258147963, "Juliana", 5.7, 21);
        Aluno aluno13 = new Aluno(753951852, "Diego", 7.3, 22);
        Aluno aluno14 = new Aluno(852963741, "Carolina", 6.4, 19);
        Aluno aluno15 = new Aluno(369852741, "Vitor", 9.2, 20);

        MapaHashLSE mapa = new MapaHashLSE();

        mapa.put(736435217, aluno1);
        mapa.put(879995247, aluno2);
        mapa.put(524109227, aluno3);
        mapa.put(123456789, aluno4);
        mapa.put(987654321, aluno5);
        mapa.put(654987321, aluno6);
        mapa.put(456123789, aluno7);
        mapa.put(789456123, aluno8);
        mapa.put(321654987, aluno9);
        mapa.put(654321987, aluno10);
        mapa.put(951753852, aluno11);
        mapa.put(258147963, aluno12);
        mapa.put(753951852, aluno13);
        mapa.put(852963741, aluno14);
        mapa.put(369852741, aluno15);

        mapa.getTudo();

        System.out.println("");

        System.out.println(mapa.getAluno(879995247));
        System.out.println(mapa.getAluno(736435217));
        System.out.println(mapa.getAluno(951753852));
        mapa.remove(879995247);
        System.out.println(mapa.getAluno(879995247));
    }
}
