package PostoZigZag;

import java.util.ArrayList;
import java.util.List;

public class PostoDeGasolina {
    private List<Combustivel> combustiveis;

    // Construtor
    public PostoDeGasolina() {
        combustiveis = new ArrayList<>();
    }

    // Método para adicionar um combustível
    public void adicionarCombustivel(Combustivel combustivel) {
        combustiveis.add(combustivel);
        System.out.println("Combustível " + combustivel.getTipo() + " adicionado ao posto.");
    }

    // Método para remover um combustível
    public boolean removerCombustivel(String tipo) {
        for (Combustivel combustivel : combustiveis) {
            if (combustivel.getTipo().equalsIgnoreCase(tipo)) {
                combustiveis.remove(combustivel);
                System.out.println("Combustível " + tipo + " removido do posto.");
                return true;
            }
        }
        System.out.println("Combustível " + tipo + " não encontrado.");
        return false;
    }

    // Método para atualizar o preço e o estoque de um combustível
    public void atualizarCombustivel(String tipo, double precoPorLitro, int estoque) {
        for (Combustivel combustivel : combustiveis) {
            if (combustivel.getTipo().equalsIgnoreCase(tipo)) {
                combustivel.setPrecoPorLitro(precoPorLitro);
                combustivel.atualizarEstoque(estoque);
                System.out.println("Combustível " + tipo + " atualizado.");
                return;
            }
        }
        System.out.println("Combustível " + tipo + " não encontrado.");
    }

    // Método para consultar as informações de um combustível
    public void consultarCombustivel(String tipo) {
        for (Combustivel combustivel : combustiveis) {
            if (combustivel.getTipo().equalsIgnoreCase(tipo)) {
                combustivel.exibirInformacoes();
                return;
            }
        }
        System.out.println("Combustível " + tipo + " não encontrado.");
    }
}

