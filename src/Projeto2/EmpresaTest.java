package Projeto2;

import java.util.Scanner;

public class EmpresaTest {

    public static void main(String[]args) {
        Empresa e = new Empresa();
        String pro;
        e.mostrarVagas();

        Scanner sc = new Scanner(System.in);
        String a = e.cargo[0];

        System.out.print("\nEscolha Uma Profissão: ");
        pro = sc.next();

        switch (pro){

            case "padeiro":
                System.out.printf("\nCargo: %s\n",e.cargo[0]);

                break;

            case "frentista":
                break;

            case "babá":

                break;

            case "programador":

                break;

            case "repositor":

                break;

            default:
                break;
        }
    }
}