package Funcoes;

import java.util.Scanner;

public class Funcao2 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("\nDigite três Valores: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int MaiorNumero = pegaInfo(pegarNumeroMaior(a,b,c));
        int MenorNumero = pegaInfo(pegarNumeroMenor(a,b,c));
        System.out.printf("\nMaior Número: %d",MaiorNumero);
        System.out.printf("\nMenor Número: %d",MenorNumero);

        sc.close();
    }

    public static int pegarNumeroMaior(int a,int b,int c){
        int z;

        if(a>b && a>c){
            z=a;
        }
        else if(b>c){
            z=b;
        }
        else{
            z=c;
        }
        return z;
    }

    public static int pegarNumeroMenor(int a, int b, int c){
       int z;

        if(a<b && a<c){
            z=a;
        }
        else if(b<a){
            z=b;
        }
        else{
            z=c;
        }
        return z;
    }
    public static int pegaInfo(int value){

        return value;
    }
}
