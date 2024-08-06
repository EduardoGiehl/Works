package EscolaZona3;

public class Professor {
    private String nome;
    private String id;
    private String materia;

    // Construtor
    public Professor(String nome, String id, String materia) {
        this.nome = nome;
        this.id = id;
        this.materia = materia;
    }

    // Métodos para acessar e modificar os atributos
    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public String getMateria() {
        return materia;
    }

    // Método para exibir as informações do professor
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("ID: " + id);
        System.out.println("Matéria: " + materia);
    }
}
