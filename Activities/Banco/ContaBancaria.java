package Banco;

public class ContaBancaria {
    private String titular;
    private double saldo;

    // Construtor
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    // Método para sacar dinheiro
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
            return false;
        }
    }

    // Método para verificar o saldo
    public double verificarSaldo() {
        return saldo;
    }

    // Método para transferir dinheiro para outra conta
    public boolean transferir(double valor, ContaBancaria contaDestino) {
        if (sacar(valor)) {
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " para a conta de " + contaDestino.getTitular() + " realizada com sucesso.");
            return true;
        } else {
            System.out.println("Transferência falhou.");
            return false;
        }
    }

    // Getter para o titular
    public String getTitular() {
        return titular;
    }
}
