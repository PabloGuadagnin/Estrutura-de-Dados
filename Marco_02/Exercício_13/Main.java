package Marco_02.Exercício_13;

import Marco_02.Exercício_13.listas.MapaHashVetor;
import Marco_02.Exercício_13.objetos.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(736435217, "José", 9.5, 19);
        Aluno aluno2 = new Aluno(879995247, "Camila", 6.5, 20);
        Aluno aluno3 = new Aluno(524109227, "Hugo", 4.5, 21);

        MapaHashVetor mapa = new MapaHashVetor();

        mapa.put(736435217, aluno1);
        mapa.put(879995247, aluno2);
        mapa.put(524109227, aluno3);

        System.out.println(mapa.get(879995247));
        System.out.println(mapa.get(736435217));
        mapa.remove(879995247);
        System.out.println(mapa.get(879995247));

    }
}
