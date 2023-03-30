package Exercício_02;

public class Main {
    public static void main(String[] args) {
        VetorAluno alunos = new VetorAluno(5);

        // Adicionando os alunos
        alunos.adiciona(new Aluno("João", 18, 8.5));
        alunos.adiciona(new Aluno("Maria", 19, 9.0));
        alunos.adiciona(new Aluno("Pedro", 20, 7.0));
        alunos.adiciona(new Aluno("Ana", 17, 6.5));
        alunos.adiciona(new Aluno("Lucas", 21, 8.0));

        // Imprime o vetor e seu tamanho.
        System.out.println(alunos.toString());

        // Imprime o tamanho do vetor
        // System.out.println("Tamanho do vetor de alunos: " + alunos.tamanho());

        // Verificando se um aluno está na lista (true)
        Aluno alunoBuscado = new Aluno("Pedro", 20, 7.0);
        if (alunos.contem(alunoBuscado.getNome())) {
            System.out.println("O aluno " + alunoBuscado.getNome() + " está na lista.");
        } else {
            System.out.println("O aluno " + alunoBuscado.getNome() + " não está na lista.");
        }

        // Verificando se outro aluno está na lista (false)
        Aluno outroAlunoBuscado = new Aluno("Mariana", 18, 9.5);
        if (alunos.contem(outroAlunoBuscado.getNome())) {
            System.out.println("O aluno " + outroAlunoBuscado.getNome() + " está na lista.");
        } else {
            System.out.println("O aluno " + outroAlunoBuscado.getNome() + " não está na lista.");
        }
    }
}