package Marco_02.Trabalho_T2.interfaces;

public interface IPilha {
    public boolean push(Object info);

    public Object pop();

    public Object top(); // retorna sem removê-lo

    public boolean isEmpty();

    public int size();
}
