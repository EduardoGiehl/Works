package TopLivros;

public class Main {
    public static void main(String[] args) {
        // Criar a biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Criar livros
        Livro livro1 = new Livro("1984", "George Orwell", "9780451524935");
        Livro livro2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "9780261103573");

        // Criar membros
        Membro membro1 = new Membro("Alice", "M001");
        Membro membro2 = new Membro("Bob", "M002");

        // Adicionar livros e membros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarMembro(membro1);
        biblioteca.adicionarMembro(membro2);

        // Consultar informações
        biblioteca.exibirLivros();
        biblioteca.exibirMembros();

        // Emprestar livro
        biblioteca.emprestarLivro("9780451524935", "M001");

        // Consultar informações após o empréstimo
        biblioteca.exibirLivros();
        biblioteca.exibirMembros();
        biblioteca.exibirEmprestimos();

        // Devolver livro
        biblioteca.devolverLivro("9780451524935", "M001");

        // Consultar informações após a devolução
        biblioteca.exibirLivros();
        biblioteca.exibirMembros();
        biblioteca.exibirEmprestimos();

        // Remover livro e membro
        biblioteca.removerLivro("9780261103573");
        biblioteca.removerMembro("M002");

        // Consultar informações finais
        biblioteca.exibirLivros();
        biblioteca.exibirMembros();
    }
}
