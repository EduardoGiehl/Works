package Zefarma;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    // Construtor
    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    // Métodos para acessar e modificar os atributos
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    // Método para atualizar o estoque
    public void atualizarEstoque(int quantidade) {
        this.estoque += quantidade;
        if (this.estoque < 0) {
            this.estoque = 0;
        }
    }

    // Método para exibir as informações do produto
    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Estoque: " + estoque);
    }
}

