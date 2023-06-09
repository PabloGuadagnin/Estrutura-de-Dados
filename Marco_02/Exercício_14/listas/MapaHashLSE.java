package Marco_02.Exercício_14.listas;

import Marco_02.Exercício_14.objetos.Aluno;

public class MapaHashLSE {
    private static final int INITIAL_CAPACITY = 10;
    private static final double LOAD_FACTOR = 0.75;

    private ListaObj[] vetorLista;
    private int size;

    public MapaHashLSE() {
        this.vetorLista = new ListaObj[INITIAL_CAPACITY];
        this.size = 0;
    }

    public void put(int chave, Aluno valor) {
        if (precisaResize()) {
            resize();
        }

        int hash = hash(chave);
        ListaObj alunos_lista = this.vetorLista[hash];
        if (alunos_lista == null) {
            alunos_lista = new ListaObj();
            alunos_lista.insereInicio(valor);
            this.vetorLista[hash] = alunos_lista;
            size++;
        } else {
            for (NohObj n = alunos_lista.getInicio(); n != null; n = n.getProximo()) {
                if (((Aluno) n.getInfo()).getMatricula() == chave) {
                    n.setInfo(valor);
                    return;
                }
            }
            alunos_lista.insereInicio(valor);
            size++;
        }
    }

    public Aluno getAluno(int chave) {
        int hash = hash(chave);
        ListaObj alunos_lista = this.vetorLista[hash];
        if (alunos_lista != null) {
            for (NohObj n = alunos_lista.getInicio(); n != null; n = n.getProximo()) {
                if (((Aluno) n.getInfo()).getMatricula() == chave) {
                    return (Aluno) n.getInfo();
                }
            }
        }
        return null;
    }

    public void getTudo() {
        System.out.println("Vetor de Listas:");
        for (int i = 0; i < vetorLista.length; i++) {
            System.out.print(i + ": ");
            if (vetorLista[i] != null) {
                System.out.println(vetorLista[i].toString());
            } else {
                System.out.println("null");
            }
        }
    }

    public ListaObj remove(int chave) {
        int hash = hash(chave);
        ListaObj aluno = this.vetorLista[hash];
        this.vetorLista[hash] = null;
        size--;
        return aluno;
    }

    private int hash(int chave) {
        return chave % vetorLista.length;
    }

    private boolean precisaResize() {
        double loadFactor = (double) size / vetorLista.length;
        return loadFactor >= LOAD_FACTOR;
    }

    private void resize() {
        // Dobra o tamanho do vetor
        int novaCapacidade = vetorLista.length * 2;
        ListaObj[] novoVetorLista = new ListaObj[novaCapacidade];
        int tamanhoAnterior = size;

        for (ListaObj lista : vetorLista) {
            if (lista != null) {
                for (NohObj no = lista.getInicio(); no != null; no = no.getProximo()) {
                    Aluno aluno = (Aluno) no.getInfo();
                    int hash = hash(aluno.getMatricula(), novaCapacidade);
                    ListaObj listaAlunos = novoVetorLista[hash];
                    if (listaAlunos == null) {
                        listaAlunos = new ListaObj();
                        novoVetorLista[hash] = listaAlunos;
                    }
                    listaAlunos.insereInicio(aluno);
                    size++;
                }
            }
        }

        vetorLista = novoVetorLista;

        // Verifica se o fator de carga é menor que o limite
        if (precisaRehash()) {
            rehash();
        }

        size = tamanhoAnterior; // Atualiza o tamanho para o valor original antes do redimensionamento
    }

    private boolean precisaRehash() {
        double fatorCarga = (double) size / vetorLista.length;
        return fatorCarga <= 0.25;
    }

    private void rehash() {
        int novaCapacidade = vetorLista.length / 2;
        ListaObj[] novoVetorLista = new ListaObj[novaCapacidade];

        for (ListaObj lista : vetorLista) {
            if (lista != null) {
                for (NohObj no = lista.getInicio(); no != null; no = no.getProximo()) {
                    Aluno aluno = (Aluno) no.getInfo();
                    int hash = hash(aluno.getMatricula(), novaCapacidade);
                    ListaObj listaAlunos = novoVetorLista[hash];
                    if (listaAlunos == null) {
                        listaAlunos = new ListaObj();
                        novoVetorLista[hash] = listaAlunos;
                    }
                    listaAlunos.insereInicio(aluno);
                }
            }
        }

        vetorLista = novoVetorLista;
    }

    private int hash(int chave, int capacity) {
        return chave % capacity;
    }
}
