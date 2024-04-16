/*
 * Este programa verifica se dois números inteiros inseridos pelo usuário são múltiplos um do outro.
 */
package atividade.i;

import java.util.Scanner;

public class Exercicio6 {
    public static void main (String[] args){

        // Cria um Scanner para receber entrada do usuário
        Scanner sc = new Scanner (System.in);

        // Variáveis para armazenar os números inseridos pelo usuário
        int numero1, numero2;

        // Solicita ao usuário que insira o primeiro número inteiro
        System.out.println("Digite o primeiro número inteiro: ");
        numero1 = sc.nextInt();

        // Solicita ao usuário que insira o segundo número inteiro
        System.out.println("Digite o segundo número inteiro: ");
        numero2 = sc.nextInt();

        // Verifica se os números são múltiplos um do outro e exibe o resultado
        if (numero1 % numero2 == 0 || numero2 % numero1 == 0 ){
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }
    }
}
