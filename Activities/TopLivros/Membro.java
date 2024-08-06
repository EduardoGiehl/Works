package TopLivros;

public class Membro {
    private String nome;
    private String id;
    private int livrosEmprestados;

    // Construtor
    public Membro(String nome, String id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = 0;
    }

    // Métodos para acessar e modificar os atributos
    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public int getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void emprestarLivro() {
        livrosEmprestados++;
    }

    public void devolverLivro() {
        if (livrosEmprestados > 0) {
            livrosEmprestados--;
        }
    }

    // Método para exibir as informações do membro
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("ID: " + id);
        System.out.println("Livros Emprestados: " + livrosEmprestados);
    }
}
