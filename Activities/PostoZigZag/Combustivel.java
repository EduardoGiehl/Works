package PostoZigZag;

public class Combustivel {
    private String tipo;
    private double precoPorLitro;
    private int estoqueEmLitros;

    // Construtor
    public Combustivel(String tipo, double precoPorLitro, int estoqueEmLitros) {
        this.tipo = tipo;
        this.precoPorLitro = precoPorLitro;
        this.estoqueEmLitros = estoqueEmLitros;
    }

    // Métodos para acessar e modificar os atributos
    public String getTipo() {
        return tipo;
    }

    public double getPrecoPorLitro() {
        return precoPorLitro;
    }

    public int getEstoqueEmLitros() {
        return estoqueEmLitros;
    }

    public void setPrecoPorLitro(double precoPorLitro) {
        this.precoPorLitro = precoPorLitro;
    }

    public void setEstoqueEmLitros(int estoqueEmLitros) {
        this.estoqueEmLitros = estoqueEmLitros;
    }

    // Método para atualizar o estoque
    public void atualizarEstoque(int quantidade) {
        this.estoqueEmLitros += quantidade;
        if (this.estoqueEmLitros < 0) {
            this.estoqueEmLitros = 0;
        }
    }

    // Método para exibir as informações do combustível
    public void exibirInformacoes() {
        System.out.println("Tipo de Combustível: " + tipo);
        System.out.println("Preço por Litro: R$" + precoPorLitro);
        System.out.println("Estoque: " + estoqueEmLitros + " litros");
    }
}
