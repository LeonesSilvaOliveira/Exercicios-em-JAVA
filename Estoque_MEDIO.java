


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Importa a classe Scanner para ler entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Declaração das variáveis
        double quantidade_minima, estoque_medio, quantidade_maxima;

        // Mensagem inicial
        System.out.println("**** CALCULADORA DE ESTOQUE MÉDIO *** \n \n");

        // Solicita e lê a quantidade mínima da peça
        System.out.println("Digite a quantidade mínima da peça: ");
        quantidade_minima = sc.nextDouble();

        // Solicita e lê a quantidade máxima da peça
        System.out.println("Digite a quantidade máxima da peça: \n");
        quantidade_maxima = sc.nextDouble();

        // Calcula o estoque médio
        estoque_medio = (quantidade_minima + quantidade_maxima)/2;

        // Exibe o estoque médio
        System.out.println("O estoque médio das peças é de: " + estoque_medio);

        // Fecha o Scanner para evitar vazamento de recursos
        sc.close();
    }
}
