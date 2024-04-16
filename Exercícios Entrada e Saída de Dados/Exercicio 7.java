/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.i;

/**
 * 07 - Implemente um programa que solicite ao usuário que insira uma sequência de
 * números inteiros positivos. O programa deve contar quantos números pares e quantos
 * números ímpares foram inseridos. Ao final, o programa deve exibir o total de números
 * pares e ímpares.
 */

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int contador_par = 0, contador_impar = 0;

        for (int i = 1; i >= 0; i++) {
            System.out.println("Digite um número inteiro POSITIVO: ");
            int numero = sc.nextInt();
            if (numero < 0) {
                break;

            }

            if (numero % 2 == 0) {
                contador_par++;

            } else {
                contador_impar++;
            }

        }

        System.out.println("Qtd - números pares: " + contador_par);
        System.out.println("Qtd - números impares: " + contador_impar);
    }

}
