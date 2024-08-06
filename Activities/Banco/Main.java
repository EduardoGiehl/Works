package Banco;

public class Main {
    public static void main(String[] args) {
        // Criar contas bancárias
        ContaBancaria conta1 = new ContaBancaria("João", 500.00);
        ContaBancaria conta2 = new ContaBancaria("Maria", 300.00);

        // Mostrar saldo inicial
        System.out.println("Saldo inicial da conta de João: R$" + conta1.verificarSaldo());
        System.out.println("Saldo inicial da conta de Maria: R$" + conta2.verificarSaldo());

        // Realizar depósitos
        conta1.depositar(150.00);
        conta2.depositar(100.00);

        // Realizar saques
        conta1.sacar(50.00);
        conta2.sacar(400.00);

        // Realizar transferências
        conta1.transferir(200.00, conta2);

        // Mostrar saldo final
        System.out.println("Saldo final da conta de João: R$" + conta1.verificarSaldo());
        System.out.println("Saldo final da conta de Maria: R$" + conta2.verificarSaldo());
    }
}
