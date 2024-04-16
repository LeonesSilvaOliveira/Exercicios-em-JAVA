/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.i;

import java.util.Scanner;

/*
 * Este programa solicita ao usuário que insira uma quantidade específica de números
 * e calcula a soma dos números pares inseridos.
 */

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a quantidade de números que deseja: ");
        double quantidade_numeros = sc.nextDouble();
        double soma = 0;

        for (int i = 1; i <= quantidade_numeros; i++) {
            System.out.println("Digite os números: ");
            double aux = sc.nextDouble();
            if (aux % 2 == 0) {
                soma += aux;


            }

        }
        System.out.println("A soma dos números pares é: " + (int) soma);

    }


}
