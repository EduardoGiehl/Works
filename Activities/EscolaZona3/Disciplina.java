package EscolaZona3;

public class Disciplina {
    private String nome;
    private String codigo;

    // Construtor
    public Disciplina(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    // Métodos para acessar e modificar os atributos
    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    // Método para exibir as informações da disciplina
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
    }
}
