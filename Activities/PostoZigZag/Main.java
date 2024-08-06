package PostoZigZag;

public class Main {
    public static void main(String[] args) {
        // Criar o posto de gasolina
        PostoDeGasolina posto = new PostoDeGasolina();

        // Criar combustíveis
        Combustivel gasolina = new Combustivel("Gasolina", 5.29, 1000);
        Combustivel etanol = new Combustivel("Etanol", 4.39, 800);
        Combustivel diesel = new Combustivel("Diesel", 6.19, 600);

        // Adicionar combustíveis ao posto
        posto.adicionarCombustivel(gasolina);
        posto.adicionarCombustivel(etanol);
        posto.adicionarCombustivel(diesel);

        // Consultar informações de um combustível
        posto.consultarCombustivel("Gasolina");

        // Atualizar o preço e o estoque de um combustível
        posto.atualizarCombustivel("Etanol", 4.49, 750);

        // Remover um combustível
        posto.removerCombustivel("Diesel");

        // Consultar informações de combustíveis após as operações
        posto.consultarCombustivel("Etanol");
        posto.consultarCombustivel("Diesel");
    }
}

