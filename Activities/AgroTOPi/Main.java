package AgroTOPi;

public class Main {
    public static void main(String[] args) {
        // Criar a agropecuária
        Agropecuaria agropecuaria = new Agropecuaria();

        // Criar produtos agrícolas
        ProdutoAgricola trigo = new ProdutoAgricola("Trigo", 50.00, 200);
        ProdutoAgricola milho = new ProdutoAgricola("Milho", 30.00, 150);

        // Criar animais
        Animal vaca = new Animal("Vaca", "Mimosa", 5);
        Animal galinha = new Animal("Galinha", "Pipoca", 2);

        // Criar insumos agrícolas
        InsumoAgricola fertilizante = new InsumoAgricola("Fertilizante", 150.00, 100);
        InsumoAgricola sementes = new InsumoAgricola("Sementes", 25.00, 500);

        // Adicionar produtos, animais e insumos
        agropecuaria.adicionarProdutoAgricola(trigo);
        agropecuaria.adicionarProdutoAgricola(milho);
        agropecuaria.adicionarAnimal(vaca);
        agropecuaria.adicionarAnimal(galinha);
        agropecuaria.adicionarInsumoAgricola(fertilizante);
        agropecuaria.adicionarInsumoAgricola(sementes);

        // Consultar informações
        agropecuaria.consultarProdutoAgricola("Trigo");
        agropecuaria.consultarAnimal("Mimosa");
        agropecuaria.consultarInsumoAgricola("Sementes");

        // Atualizar e remover informações
        agropecuaria.atualizarProdutoAgricola("Milho", 32.00, 120);
        agropecuaria.atualizarInsumoAgricola("Fertilizante", 160.00, 90);
        agropecuaria.removerAnimal("Pipoca");

        // Consultar novamente para ver as atualizações
        agropecuaria.consultarProdutoAgricola("Milho");
        agropecuaria.consultarInsumoAgricola("Fertilizante");
        agropecuaria.consultarAnimal("Pipoca");
    }
}
