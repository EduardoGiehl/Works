package EscolaZona3;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Colegio {
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Disciplina> disciplinas;
    private List<Turma> turmas;

    // Construtor
    public Colegio() {
        alunos = new ArrayList<>();
        professores = new ArrayList<>();
        disciplinas = new ArrayList<>();
        turmas = new ArrayList<>();
    }

    // Métodos para gerenciar alunos
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno " + aluno.getNome() + " adicionado.");
    }

    public boolean removerAluno(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                alunos.remove(aluno);
                System.out.println("Aluno com matrícula " + matricula + " removido.");
                return true;
            }
        }
        System.out.println("Aluno com matrícula " + matricula + " não encontrado.");
        return false;
    }

    public Aluno buscarAluno(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        return null;
    }

    // Métodos para gerenciar professores
    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
        System.out.println("Professor " + professor.getNome() + " adicionado.");
    }

    public boolean removerProfessor(String id) {
        for (Professor professor : professores) {
            if (professor.getId().equals(id)) {
                professores.remove(professor);
                System.out.println("Professor com ID " + id + " removido.");
                return true;
            }
        }
        System.out.println("Professor com ID " + id + " não encontrado.");
        return false;
    }

    public Professor buscarProfessor(String id) {
        for (Professor professor : professores) {
            if (professor.getId().equals(id)) {
                return professor;
            }
        }
        return null;
    }

    // Métodos para gerenciar disciplinas
    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
        System.out.println("Disciplina " + disciplina.getNome() + " adicionada.");
    }

    public boolean removerDisciplina(String codigo) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getCodigo().equals(codigo)) {
                disciplinas.remove(disciplina);
                System.out.println("Disciplina com código " + codigo + " removida.");
                return true;
            }
        }
        System.out.println("Disciplina com código " + codigo + " não encontrada.");
        return false;
    }

    public Disciplina buscarDisciplina(String codigo) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getCodigo().equals(codigo)) {
                return disciplina;
            }
        }
        return null;
    }

    // Métodos para gerenciar turmas
    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
        System.out.println("Turma " + turma.getNome() + " adicionada.");
    }

    public boolean removerTurma(String nome) {
        for (Turma turma : turmas) {
            if (turma.getNome().equals(nome)) {
                turmas.remove(turma);
                System.out.println("Turma " + nome + " removida.");
                return true;
            }
        }
        System.out.println("Turma " + nome + " não encontrada.");
        return false;
    }

    public Turma buscarTurma(String nome) {
        for (Turma turma : turmas) {
            if (turma.getNome().equals(nome)) {
                return turma;
            }
        }
        return null;
    }

    // Métodos para exibir informações
    public void exibirAlunos() {
        for (Aluno aluno : alunos) {
            aluno.exibirInformacoes();
            System.out.println();
        }
    }

    public void exibirProfessores() {
        for (Professor professor : professores) {
            professor.exibirInformacoes();
            System.out.println();
        }
    }

    public void exibirDisciplinas() {
        for (Disciplina disciplina : disciplinas) {
            disciplina.exibirInformacoes();
            System.out.println();
        }
    }

    public void exibirTurmas() {
        for (Turma turma : turmas) {
            turma.exibirInformacoes();
            System.out.println();
        }
    }
}
