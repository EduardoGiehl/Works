package Zefarma;
public class Main {
    public static void main(String[] args) {
        // Criar a farmácia
        Farmacia farmacia = new Farmacia();

        // Criar produtos
        Produto produto1 = new Produto("Paracetamol", 12.99, 100);
        Produto produto2 = new Produto("Ibuprofeno", 9.99, 50);
        Produto produto3 = new Produto("Aspirina", 15.49, 75);

        // Adicionar produtos à farmácia
        farmacia.adicionarProduto(produto1);
        farmacia.adicionarProduto(produto2);
        farmacia.adicionarProduto(produto3);

        // Consultar informações de um produto
        farmacia.consultarProduto("Paracetamol");

        // Atualizar o estoque de um produto
        farmacia.atualizarEstoque("Ibuprofeno", 20);

        // Remover um produto
        farmacia.removerProduto("Aspirina");

        // Consultar informações de produtos após as operações
        farmacia.consultarProduto("Ibuprofeno");
        farmacia.consultarProduto("Aspirina");
    }
}
