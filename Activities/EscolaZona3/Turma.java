package EscolaZona3;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nome;
    private List<Aluno> alunos;
    private Disciplina disciplina;
    private Professor professor;

    // Construtor
    public Turma(String nome, Disciplina disciplina, Professor professor) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    // Métodos para adicionar e remover alunos
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno " + aluno.getNome() + " adicionado à turma " + nome + ".");
    }

    public void removerAluno(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                alunos.remove(aluno);
                System.out.println("Aluno com matrícula " + matricula + " removido da turma " + nome + ".");
                return;
            }
        }
        System.out.println("Aluno com matrícula " + matricula + " não encontrado na turma " + nome + ".");
    }

    // Métodos para exibir informações da turma
    public void exibirInformacoes() {
        System.out.println("Turma: " + nome);
        System.out.println("Disciplina: ");
        disciplina.exibirInformacoes();
        System.out.println("Professor: ");
        professor.exibirInformacoes();
        System.out.println("Alunos:");
        for (Aluno aluno : alunos) {
            aluno.exibirInformacoes();
            System.out.println();
        }
    }
}
