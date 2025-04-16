package Exercicios;

// FORMULA CÉLSIUS
// Fazer um programa para ler uma temperatura em Celsius
// Mostrar o equivalente em Fahrenheit. Perguntar se o usuário
// Deseja repetir(s/n). Caso o usuário digite 's'
// repetir o programa
// F = 9C/5 + 32

import java.util.Scanner;
import java.util.Locale;

public class Exe1 {

    public static void main(String[]args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char opt;

        do{
            System.out.print("\nDigite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = (9*C/5)+32;

            System.out.printf("\nEquivalente em Fahrenheit: %.1f",F);

            System.out.println("\nDeseja Repetir (s/n): ");
            opt = sc.next().charAt(0);

            if(opt=='s' || opt=='S'){

            }
            else if(opt=='n' || opt=='N'){
                System.out.println("\nobrigado por utilizar o programa!\n");
                break;
            }
            else{
                System.out.println("\nOpção Inválida!");
            }
        }while(opt!='n' || opt!='N');
        sc.close();
    }
}
