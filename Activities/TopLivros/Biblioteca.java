package TopLivros;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Membro> membros;
    private List<Emprestimo> emprestimos;

    // Construtor
    public Biblioteca() {
        livros = new ArrayList<>();
        membros = new ArrayList<>();
        emprestimos = new ArrayList<>();
    }

    // Métodos para gerenciar livros
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro " + livro.getTitulo() + " adicionado.");
    }

    public boolean removerLivro(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                livros.remove(livro);
                System.out.println("Livro com ISBN " + isbn + " removido.");
                return true;
            }
        }
        System.out.println("Livro com ISBN " + isbn + " não encontrado.");
        return false;
    }

    public Livro buscarLivro(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null;
    }

    // Métodos para gerenciar membros
    public void adicionarMembro(Membro membro) {
        membros.add(membro);
        System.out.println("Membro " + membro.getNome() + " adicionado.");
    }

    public boolean removerMembro(String id) {
        for (Membro membro : membros) {
            if (membro.getId().equals(id)) {
                membros.remove(membro);
                System.out.println("Membro com ID " + id + " removido.");
                return true;
            }
        }
        System.out.println("Membro com ID " + id + " não encontrado.");
        return false;
    }

    public Membro buscarMembro(String id) {
        for (Membro membro : membros) {
            if (membro.getId().equals(id)) {
                return membro;
            }
        }
        return null;
    }

    // Métodos para gerenciar empréstimos
    public boolean emprestarLivro(String isbn, String id) {
        Livro livro = buscarLivro(isbn);
        Membro membro = buscarMembro(id);
        if (livro != null && membro != null && livro.isDisponivel()) {
            Emprestimo emprestimo = new Emprestimo(livro, membro);
            emprestimos.add(emprestimo);
            livro.setDisponivel(false);
            membro.emprestarLivro();
            System.out.println("Livro " + livro.getTitulo() + " emprestado para " + membro.getNome() + ".");
            return true;
        }
        System.out.println("Empréstimo não realizado. Verifique se o livro está disponível e se o membro existe.");
        return false;
    }

    public boolean devolverLivro(String isbn, String id) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getLivro().getIsbn().equals(isbn) && emprestimo.getMembro().getId().equals(id)) {
                emprestimo.registrarDevolucao();
                emprestimos.remove(emprestimo);
                System.out.println("Livro " + emprestimo.getLivro().getTitulo() + " devolvido por " + emprestimo.getMembro().getNome() + ".");
                return true;
            }
        }
        System.out.println("Devolução não registrada. Verifique se o livro e o membro correspondem a um empréstimo.");
        return false;
    }

    // Métodos para exibir informações
    public void exibirLivros() {
        for (Livro livro : livros) {
            livro.exibirInformacoes();
            System.out.println();
        }
    }

    public void exibirMembros() {
        for (Membro membro : membros) {
            membro.exibirInformacoes();
            System.out.println();
        }
    }

    public void exibirEmprestimos() {
        for (Emprestimo emprestimo : emprestimos) {
            emprestimo.exibirInformacoes();
            System.out.println();
        }
    }
}
