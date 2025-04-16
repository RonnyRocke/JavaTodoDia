package ExercicioYoutube;

// Desafio Java Cida Castello - Youtube - Aula FInal 051
// Implementar uma aplicação para cadastro de conta Bancária conforme
// diagrama UML utilizando os métodos Getters e Setters.

/*ContaBancaria
 * ---------------
 * -nome: String
 * -numeroDaConta: String
 * -agencia: String
 * -saldo: double
 * -ativa: boolean
 * ---------------
 *
 *
 * */

import java.util.Scanner;
import java.util.Locale;

public class ContaBancariaTest {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaBancaria c = new ContaBancaria();

        boolean isAtiva = true;
        c.setAtiva(isAtiva);

        System.out.println("\nRegistro De Conta Bancária");

        System.out.print("\nDigite Seu Nome: ");
        String nome= sc.nextLine();
        c.setNome(nome);

        System.out.print("\nDigite O Numero Da Conta: ");
        String numeroDaconta = sc.nextLine();
        c.setNumeroDaConta(numeroDaconta);

        System.out.print("\nDigite A Agência: ");
        String agencia = sc.nextLine();
        c.setAgencia(agencia);

        System.out.print("\nDigite o Saldo: ");
        double saldo = sc.nextDouble();
        c.setSaldo(saldo);

        c.mostraDados();

        sc.close();
    }
}

