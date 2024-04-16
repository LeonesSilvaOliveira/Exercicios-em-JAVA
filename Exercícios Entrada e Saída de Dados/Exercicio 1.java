/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.i;

/**
 * /**
 * * Este é um programa simples que conta de 0 a 50 e imprime "PIM" ao encontrar números divisíveis por 4.
 */

public class Exercicio1 {


    public static void main(String[] args) {

        for (int i = 0; i <= 50; i++) {
            System.out.println(i);
            if (i % 4 == 0) {
                System.out.println("PIM");

            } else {
                System.out.println(i);
            }

        }

    }

}
