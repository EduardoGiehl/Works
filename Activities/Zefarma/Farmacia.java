package Zefarma;
import java.util.ArrayList;
import java.util.List;



public class Farmacia {
    private List<Produto> produtos;

    // Construtor
    public Farmacia() {
        produtos = new ArrayList<>();
    }

    // Método para adicionar um produto
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto " + produto.getNome() + " adicionado à farmácia.");
    }

    // Método para remover um produto
    public boolean removerProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produtos.remove(produto);
                System.out.println("Produto " + nome + " removido da farmácia.");
                return true;
            }
        }
        System.out.println("Produto " + nome + " não encontrado.");
        return false;
    }

    // Método para atualizar o estoque de um produto
    public void atualizarEstoque(String nome, int quantidade) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produto.atualizarEstoque(quantidade);
                System.out.println("Estoque atualizado para o produto " + nome + ".");
                return;
            }
        }
        System.out.println("Produto " + nome + " não encontrado.");
    }

    // Método para consultar as informações de um produto
    public void consultarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produto.exibirInformacoes();
                return;
            }
        }
        System.out.println("Produto " + nome + " não encontrado.");
    }
}
