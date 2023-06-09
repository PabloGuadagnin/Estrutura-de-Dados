package Marco_02.Exercício_13.listas;

import Marco_02.Exercício_13.objetos.Aluno;

public class MapaHashLSE {
    private LSE[] vetorLista; // vetor de listas e não mais de Aluno

    public MapaHashLSE() {
        this.vetorLista = new LSE[10]; // mas a LSE é de alunos!
    }

    public void put(int chave, Aluno valor) {
        int hash = hash(chave);
        LSE alunos_lista = this.vetorLista[hash];
        if (alunos_lista == null) {
        alunos_lista = new LSE();
        alunos_lista.insereInicio(valor);
        this.vetorLista[hash] = alunos_lista;
        } else {
        for (Noh n = alunos_lista.getInicio(); n != null; n = n.getProx()) {
        if (n.getInfo().getMatricula() == chave) {
        n.setInfo(valor);
        return;
        }
        }
        alunos_lista.insereInicio(valor);
        }
        }
}
