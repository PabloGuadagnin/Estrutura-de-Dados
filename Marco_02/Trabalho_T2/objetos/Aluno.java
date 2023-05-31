package Marco_02.Trabalho_T2.objetos;

public class Aluno {
    private String nome;
    private double nota;
    private int idade;

    public Aluno(String nome, double nota, int idade) {
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
    }

    public String toString() {
        return "Nome: " + nome +
                ", Idade: " + idade +
                ", Nota: " + nota +
                "\n";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}