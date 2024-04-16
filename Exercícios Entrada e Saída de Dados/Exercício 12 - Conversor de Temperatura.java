
import java.util.Scanner;

//Conversor de Temperatura:
//Faça um programa que converta uma temperatura em Celsius para Fahrenheit. Solicite ao usuário a temperatura em Celsius e exiba a temperatura equivalente em Fahrenheit.
// Considere F = C x 1,8 + 32.
public class Conversor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int temp_celcius, temp_fahrenheit;

        System.out.println("CONVERSOR DE TEMPERATURA DE CELCIUS PARA FAHRENHEIT\n");

        System.out.println("Digite a temperatura em Celcius: ");
        temp_celcius = sc.nextInt();

        temp_fahrenheit = (int) (temp_celcius * 1.8) + 32; // conversão explícita

        System.out.println("A temperatura em Fahrenheit é: " + temp_fahrenheit);



        //CELCIUS PARA FAHRENHEIT

    }
}
