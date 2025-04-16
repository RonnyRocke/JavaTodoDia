package Funcoes;

import java.io.Serializable;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.Locale;

public class Funcao {

    Serializable maiorNumero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite Tamanho do Array: ");
        int tam = sc.nextInt();
        int maior_numero[]=new int[tam];
        String msgError ="\nNão Existem elementos!";

        System.out.println("\nDigite os Números: ");

        for(int i = 0; i<maior_numero.length;i++){
            maior_numero[i] = sc.nextInt();
        }

        OptionalInt numero_maior = Arrays.stream(maior_numero).max();
        System.out.println("\nTamanho do Array: "+maior_numero.length);

        if(numero_maior.isPresent()){
            return numero_maior.getAsInt();
        }
        else{
            return msgError;
             }
        }

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Funcao f = new Funcao();

        System.out.println("Maior Número: "+f.maiorNumero());
    }
}
