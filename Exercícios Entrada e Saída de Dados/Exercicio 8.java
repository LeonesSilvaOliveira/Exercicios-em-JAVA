package atividade.i;

/*

Crie um programa que peça ao usuário para digitar um número inteiro positivo N.
O programa deve verificar se N é um número primo ou não. Um número primo é aquele
que é divisível apenas por 1 e por ele mesmo. O programa deve exibir uma mensagem
indicando se o número fornecido é primo ou não.


int aux, num=479001599, div=0;

    for(aux=2 ; aux<=num/2 ; aux++)
        if(num%aux==0)
            div++;
 */

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aux, div = 0;
        System.out.println("Digite um número inteiro positivo para saber se é primo: ");
        int num = sc.nextInt();

        for (aux = 2; aux <= Math.sqrt(num) ; aux++) {
            if (num % aux == 0) {
                div++;
            }


        }
        if (div == 0) {
            System.out.println("É PRIMO");

        } else {
            System.out.println("Não é primo");
        }


    }
}
