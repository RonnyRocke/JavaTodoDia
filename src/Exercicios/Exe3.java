package Exercicios;

import java.util.Scanner;
import java.util.Locale;

public class Exe3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nWhat is the Dollar Price: ");
        double cotacao_dolar = entrada.nextDouble();

        System.out.println("\nHow many dollars will be bought: ");
        double dolar_comprado = entrada.nextDouble();

        double valortotal = dolar_comprado*cotacao_dolar;
        double valorimposto = valortotal*0.6;
        double valorfinal = valorimposto+valortotal;

        System.out.printf("\nCotação do Dolar: $%.2f",cotacao_dolar);
        System.out.printf("\nAmount to be paid  in  reais: $%.2f\n",valorfinal);

        entrada.close();
    }
}
