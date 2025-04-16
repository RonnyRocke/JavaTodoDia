package Exercicios;

import java.util.Scanner;

public class Exe2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tam=5;
        char[]respostas=new char[tam];
        char[]gabarito={'a','d','a','c','b'};
        int notas=0;

        for(int i=0; i<tam;i++){
            System.out.printf("\nInforme a %d° Resposta: ",i);
            respostas[i]= sc.nextLine().charAt(0);
        }

        for (int j=0;j<tam; j++){

            if(respostas[j]==gabarito[j]){
                notas++;
            }
        }
        System.out.printf("\nAcertos: %d ",notas);

        if(notas>=3){
            System.out.printf("\nAprovado! ");
        }
        else{
            System.out.printf("\nReprovado! ");
        }
        sc.close();
    }
}
