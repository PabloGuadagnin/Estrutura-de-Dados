package Marco_03.Exercício_16;

public class ABB {

    private Noh raiz;

    public boolean isEmpty() {
        return this.raiz == null;
    }

    public void add(int element) {
        if (isEmpty()) {
            this.raiz = new Noh(element);
        } else {
            Noh aux = this.raiz;
            while (aux != null) {
                if (element < aux.valor) {
                    if (aux.esq == null) {
                        Noh newNode = new Noh(element);
                        aux.esq = newNode;
                        newNode.pai = aux;
                        return;
                    }
                    aux = aux.esq;
                } else {
                    if (aux.dir == null) {
                        Noh newNode = new Noh(element);
                        aux.dir = newNode;
                        newNode.pai = aux;
                        return;
                    }
                    aux = aux.dir;
                } // fim else
            } // fim while
        } // fim else
    } // fim da operação add

    public void recursiveAdd(int element) {
        if (isEmpty()) {
            this.raiz = new Noh(element);
        } else {
            recursiveAdd(this.raiz, element);
        }
    }

    // método privado para controle da recursão
    private void recursiveAdd(Noh node, int element) {
        if (element < node.valor) {
            if (node.esq == null) {
                Noh newNode = new Noh(element);
                node.esq = newNode;
                newNode.pai = node;
                return;
            }
            recursiveAdd(node.esq, element);
        } else {
            if (node.dir == null) {
                Noh newNode = new Noh(element);
                node.dir = newNode;
                newNode.pai = node;
                return;
            }
            recursiveAdd(node.dir, element);
        }
    }

    public boolean busca(int element) {
        return busca(raiz, element);
    }

    private boolean busca(Noh node, int element) {
        if (node == null)
            return false;

        if (node.valor == element)
            return true;

        if (element < node.valor)
            return busca(node.esq, element);
        else
            return busca(node.dir, element);
    }

    public Noh buscaIter(int element) {
        Noh aux = this.raiz;
        while (aux != null) {
            if (aux.valor == element)
                return aux;
            if (element < aux.valor)
                aux = aux.esq;
            if (element > aux.valor)
                aux = aux.dir;
        }
        return null;
    }

    public Noh buscaRec(int element) {
        return buscaRec(this.raiz, element);
    }

    private Noh buscaRec(Noh node, int element) {
        if (node == null)
            return null;
        if (element == node.valor)
            return node;
        if (element < node.valor)
            return buscaRec(node.esq, element);
        else
            return buscaRec(node.dir, element);
    }

    public void preOrdem() {
        preOrdem(this.raiz);
    }

    private void preOrdem(Noh node) {
        if (node != null) {
            System.out.println(node.valor);
            preOrdem(node.esq);
            preOrdem(node.dir);
        }
    }

    public void emOrdem() {
        emOrdem(this.raiz);
    }

    private void emOrdem(Noh node) {
        if (node != null) {
            emOrdem(node.esq);
            System.out.println(node.valor);
            emOrdem(node.dir);
        }
    }

    public void posOrdem() {
        posOrdem(this.raiz);
    }

    private void posOrdem(Noh node) {
        if (node != null) {
            posOrdem(node.esq);
            posOrdem(node.dir);
            System.out.println(node.valor);
            // note que a impressão só ocorre depois
        }
    }

    public void remove(int element) {
        this.raiz = remove(this.raiz, element);
    }

    private Noh remove(Noh node, int element) {
        if (node == null) {
            return null;
        }

        if (element < node.valor) {
            node.esq = remove(node.esq, element);
        } else if (element > node.valor) {
            node.dir = remove(node.dir, element);
        } else {
            // O nó atual é o nó a ser removido
            if (node.esq == null && node.dir == null) {
                // Caso 1: Nó é uma folha
                return null;
            } else if (node.esq == null) {
                // Caso 2: Nó tem apenas um filho à direita
                return node.dir;
            } else if (node.dir == null) {
                // Caso 2: Nó tem apenas um filho à esquerda
                return node.esq;
            } else {
                // Caso 3: Nó tem dois filhos
                // Encontrar o nó sucessor (menor valor na subárvore direita)
                Noh sucessor = findMin(node.dir);
                // Substituir o valor do nó atual pelo valor do nó sucessor
                node.valor = sucessor.valor;
                // Remover o nó sucessor da subárvore direita recursivamente
                node.dir = remove(node.dir, sucessor.valor);
            }
        }

        return node;
    }

    private Noh findMin(Noh node) {
        while (node.esq != null) {
            node = node.esq;
        }
        return node;
    }

}