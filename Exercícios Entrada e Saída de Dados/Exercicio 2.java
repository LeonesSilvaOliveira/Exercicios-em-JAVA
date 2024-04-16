/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Este programa solicita ao usuário que insira 20 números e calcula a média deles.


package atividade.i;

import java.util.Scanner;


public class Exercicio2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        double soma = 0;

        for (int i = 1; i <= 20; i++) {

            System.out.println("Digite um número: ");
            double aux = sc.nextDouble();
            soma = soma + aux;


        }
        System.out.println("A média é: " + soma / 20);
    }

}
