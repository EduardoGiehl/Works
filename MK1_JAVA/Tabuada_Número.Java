import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        // Criar um objeto Scanner para leitura de entrada
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar ao usuário para inserir um número
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();
        
        // Imprimir a tabuada do número
        System.out.println("Tabuada do número " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
        // Fechar o scanner
        scanner.close();
    }
}
