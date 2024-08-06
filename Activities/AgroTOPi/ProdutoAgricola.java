package AgroTOPi;

public class ProdutoAgricola {
    private String nome;
    private double precoPorUnidade;
    private int estoque;

    // Construtor
    public ProdutoAgricola(String nome, double precoPorUnidade, int estoque) {
        this.nome = nome;
        this.precoPorUnidade = precoPorUnidade;
        this.estoque = estoque;
    }

    // Métodos para acessar e modificar os atributos
    public String getNome() {
        return nome;
    }

    public double getPrecoPorUnidade() {
        return precoPorUnidade;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setPrecoPorUnidade(double precoPorUnidade) {
        this.precoPorUnidade = precoPorUnidade;
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
        System.out.println("Produto Agrícola: " + nome);
        System.out.println("Preço por Unidade: R$" + precoPorUnidade);
        System.out.println("Estoque: " + estoque + " unidades");
    }
}
