/*
 * Este programa calcula quantos meses são necessários para Maria ter mais dinheiro do que João em suas respectivas poupanças.
 */
package atividade.i;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double dinheiroPoupancaJoao = 1000;
        double rendimentoMesJoao = 0.01 / 2;
        double rendimentoMesMaria = 0.01;
        double dinheiroPoupancaMaria = 100;

        int meses = 0;
        // Loop para calcular quantos meses são necessários para Maria ter mais dinheiro que João
        while (dinheiroPoupancaJoao > dinheiroPoupancaMaria) {
            dinheiroPoupancaMaria *= (1 + rendimentoMesMaria);
            dinheiroPoupancaJoao *= (1 + rendimentoMesJoao);
            meses++;
        }

        System.out.println("A quantidade de meses foi de: " + meses + " meses");
    }
}
