package AgroTOPi;

import java.util.ArrayList;
import java.util.List;

public class Agropecuaria {
    private List<ProdutoAgricola> produtosAgricolas;
    private List<Animal> animais;
    private List<InsumoAgricola> insumosAgricolas;

    // Construtor
    public Agropecuaria() {
        produtosAgricolas = new ArrayList<>();
        animais = new ArrayList<>();
        insumosAgricolas = new ArrayList<>();
    }

    // Métodos para gerenciar produtos agrícolas
    public void adicionarProdutoAgricola(ProdutoAgricola produto) {
        produtosAgricolas.add(produto);
        System.out.println("Produto agrícola " + produto.getNome() + " adicionado.");
    }

    public void removerProdutoAgricola(String nome) {
        for (ProdutoAgricola produto : produtosAgricolas) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produtosAgricolas.remove(produto);
                System.out.println("Produto agrícola " + nome + " removido.");
                return;
            }
        }
        System.out.println("Produto agrícola " + nome + " não encontrado.");
    }

    public void atualizarProdutoAgricola(String nome, double precoPorUnidade, int estoque) {
        for (ProdutoAgricola produto : produtosAgricolas) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produto.setPrecoPorUnidade(precoPorUnidade);
                produto.setEstoque(estoque);
                System.out.println("Produto agrícola " + nome + " atualizado.");
                return;
            }
        }
        System.out.println("Produto agrícola " + nome + " não encontrado.");
    }

    public void consultarProdutoAgricola(String nome) {
        for (ProdutoAgricola produto : produtosAgricolas) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produto.exibirInformacoes();
                return;
            }
        }
        System.out.println("Produto agrícola " + nome + " não encontrado.");
    }

    // Métodos para gerenciar animais
    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
        System.out.println("Animal " + animal.getNome() + " adicionado.");
    }

    public void removerAnimal(String nome) {
        for (Animal animal : animais) {
            if (animal.getNome().equalsIgnoreCase(nome)) {
                animais.remove(animal);
                System.out.println("Animal " + nome + " removido.");
                return;
            }
        }
        System.out.println("Animal " + nome + " não encontrado.");
    }

    public void consultarAnimal(String nome) {
        for (Animal animal : animais) {
            if (animal.getNome().equalsIgnoreCase(nome)) {
                animal.exibirInformacoes();
                return;
            }
        }
        System.out.println("Animal " + nome + " não encontrado.");
    }

    // Métodos para gerenciar insumos agrícolas
    public void adicionarInsumoAgricola(InsumoAgricola insumo) {
        insumosAgricolas.add(insumo);
        System.out.println("Insumo agrícola " + insumo.getNome() + " adicionado.");
    }

    public void removerInsumoAgricola(String nome) {
        for (InsumoAgricola insumo : insumosAgricolas) {
            if (insumo.getNome().equalsIgnoreCase(nome)) {
                insumosAgricolas.remove(insumo);
                System.out.println("Insumo agrícola " + nome + " removido.");
                return;
            }
        }
        System.out.println("Insumo agrícola " + nome + " não encontrado.");
    }

    public void atualizarInsumoAgricola(String nome, double precoPorUnidade, int estoque) {
        for (InsumoAgricola insumo : insumosAgricolas) {
            if (insumo.getNome().equalsIgnoreCase(nome)) {
                insumo.setPrecoPorUnidade(precoPorUnidade);
                insumo.setEstoque(estoque);
                System.out.println("Insumo agrícola " + nome + " atualizado.");
                return;
            }
        }
        System.out.println("Insumo agrícola " + nome + " não encontrado.");
    }

    public void consultarInsumoAgricola(String nome) {
        for (InsumoAgricola insumo : insumosAgricolas) {
            if (insumo.getNome().equalsIgnoreCase(nome)) {
                insumo.exibirInformacoes();
                return;
            }
        }
        System.out.println("Insumo agrícola " + nome + " não encontrado.");
    }
}

