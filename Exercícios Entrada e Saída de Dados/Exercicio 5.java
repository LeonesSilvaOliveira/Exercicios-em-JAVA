/*
 * Este programa calcula o custo de uma viagem de carro com base na distância a percorrer e no consumo médio de combustível.
 */
package atividade.i;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String [] args){

        // Preço por litro de gasolina
        float precoGasolina = 5.68F;

        // Cria um Scanner para receber entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Variável para armazenar a distância a ser percorrida
        float distancia;
        System.out.println("Digite a quantidade de KM: ");
        distancia = sc.nextFloat();

        // Variável para armazenar o consumo médio de combustível em Km/l
        int consumoMedio;
        System.out.println("Digite o consumo médio em Km/l");
        consumoMedio = sc.nextInt();

        // Calcula a quantidade de litros necessários para a viagem
        float litros = distancia / consumoMedio;

        // Calcula o custo total da viagem
        float custoTotal = litros * precoGasolina;

        // Imprime o resultado
        System.out.printf("Você gastará: %.2f litros e R$: %.2f", litros, custoTotal);
    }
}
