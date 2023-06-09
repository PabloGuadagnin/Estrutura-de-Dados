package Exercício_05;

public class LSE implements Lista {

    private Noh inicio;

    public LSE(){
        this.inicio = null;
    }

    @Override
    public void insereInicio(int info) {
        Noh novo = new Noh(info);

        if(inicio == null)
            inicio = novo;
        else{
            novo.setProximo(inicio);
            inicio = novo;
        }
        
    }

    @Override
    public void insereFim(int info) {
        Noh novo = new Noh(info);
        if (inicio == null)
            inicio = novo;
        else{
            Noh ultimo = null;
            for(Noh i = inicio; i != null; i = i.getProximo())
                ultimo = i;
            ultimo.setProximo(novo);
        }
        
    }

    @Override
    public boolean estahVazia() {
        return this.inicio == null;
    }

    @Override
    public boolean remove(int info) {
        Noh ant = null, p;
        p = inicio;
        while (p != null && p.getInfo() != info){
            ant = p;
            p = p.getProximo();
        }
        if (p == null)
            return false;
        if(ant == null)
            inicio = p.getProximo();
        else 
            ant.setProximo(p.getProximo());
            return true;
    }

    @Override
    public int tamanho() {
        int tamanho = 0;
        Noh novoNoh = inicio;
        while (novoNoh != null){
            tamanho++;
            novoNoh = novoNoh.getProximo();
        }
        return tamanho;
    }

    public void imprimeLista(){
        Noh novoNoh = inicio;
        while (novoNoh !=null){
            System.out.println(novoNoh.getInfo()+" ");
            novoNoh = novoNoh.getProximo();
        }
        System.out.println("");
    }

   
}