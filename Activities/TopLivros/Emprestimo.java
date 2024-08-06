package TopLivros;

import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Membro membro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    // Construtor
    public Emprestimo(Livro livro, Membro membro) {
        this.livro = livro;
        this.membro = membro;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucao = null; // Inicialmente, a devolução não foi feita
    }

    // Métodos para acessar e modificar os atributos
    public Livro getLivro() {
        return livro;
    }

    public Membro getMembro() {
        return membro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void registrarDevolucao() {
        this.dataDevolucao = LocalDate.now();
        livro.setDisponivel(true);
        membro.devolverLivro();
    }

    // Método para exibir as informações do empréstimo
    public void exibirInformacoes() {
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Membro: " + membro.getNome());
        System.out.println("Data do Empréstimo: " + dataEmprestimo);
        System.out.println("Data de Devolução: " + (dataDevolucao != null ? dataDevolucao : "Não devolvido ainda"));
    }
}
