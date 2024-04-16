import java.util.Scanner;

public class CalculadoraIdade {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int idade_anos, meses, dias;

        System.out.println("Calculadora de Idade em Dias: \n");

        System.out.println("Digite a idade em anos: ");
        idade_anos = sc.nextInt();

        // Calculando os meses em dias (considerando 30 dias por mês)
        meses = idade_anos * 12;

        // Calculando os dias totais (considerando 365 dias por ano)
        dias = idade_anos * 365;

        System.out.println("Sua idade em dias é: " + dias + " dias");
    }
}
