package EscolaZona3;

public class Main {
    public static void main(String[] args) {
        // Criar o colégio
        Colegio colegio = new Colegio();

        // Criar alunos
        Aluno aluno1 = new Aluno("Ana", "A001", 15);
        Aluno aluno2 = new Aluno("Carlos", "A002", 16);

        // Criar professores
        Professor professor1 = new Professor("Maria", "P001", "Matemática");
        Professor professor2 = new Professor("João", "P002", "História");

        // Criar disciplinas
        Disciplina disciplina1 = new Disciplina("Matemática", "D001");
        Disciplina disciplina2 = new Disciplina("História", "D002");

        // Criar turmas
        Turma turma1 = new Turma("1º Ano A", disciplina1, professor1);
        Turma turma2 = new Turma("2º Ano B", disciplina2, professor2);

        // Adicionar alunos, professores, disciplinas e turmas ao colégio
        colegio.adicionarAluno(aluno1);
        colegio.adicionarAluno(aluno2);
        colegio.adicionarProfessor(professor1);
        colegio.adicionarProfessor(professor2);
        colegio.adicionarDisciplina(disciplina1);
        colegio.adicionarDisciplina(disciplina2);
        colegio.adicionarTurma(turma1);
        colegio.adicionarTurma(turma2);

        // Adicionar alunos às turmas
        turma1.adicionarAluno(aluno1);
        turma2.adicionarAluno(aluno2);

        // Consultar informações
        colegio.exibirAlunos();
        colegio.exibirProfessores();
        colegio.exibirDisciplinas();
        colegio.exibirTurmas();

        // Remover aluno e disciplina
        colegio.removerAluno("A002");
        colegio.removerDisciplina("D002");

        // Consultar informações após remoções
        colegio.exibirAlunos();
        colegio.exibirProfessores();
        colegio.exibirDisciplinas();
        colegio.exibirTurmas();
    }
}
