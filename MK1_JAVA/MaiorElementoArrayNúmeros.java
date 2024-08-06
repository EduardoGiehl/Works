public class MaiorElementoArrayNúmeros {
    public static void main(String[] args) {
        int[] numeros = {5, 12, 7, 3, 19, 8};
        int maior = encontrarMaior(numeros);
        System.out.println("O maior elemento do array é: " + maior);
    }

    // Função para encontrar o maior elemento em um array de números
    public static int encontrarMaior(int[] array) {
        int maior = array[0];
        for (int numero : array) {
            if (numero > maior) {
                maior = numero;
            }
        }
        return maior;
    }
}