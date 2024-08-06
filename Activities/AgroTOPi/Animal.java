package AgroTOPi;

public class Animal {
    private String especie;
    private String nome;
    private int idade;

    // Construtor
    public Animal(String especie, String nome, int idade) {
        this.especie = especie;
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos para acessar e modificar os atributos
    public String getEspecie() {
        return especie;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para exibir as informações do animal
    public void exibirInformacoes() {
        System.out.println("Espécie: " + especie);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }
}

