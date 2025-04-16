package com.enginedeninjas;

import java.util.Scanner;
import java.util.Locale;

public class NinjaTest {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Ninja naruto = new Ninja("Naruto Uzumaki",16,"Resgatar-Sasuke",()->{

            int cloneDasSombras=0;

            while(cloneDasSombras<5){
                ++cloneDasSombras;
                System.out.printf("\nNaruto utilizou clone das sombras: %d vezes",cloneDasSombras);

            }
            System.out.println();
        });

        Ninja sasuke = new Ninja("Sasuke Uchiha",13,"Matar-Naruto",()->{
            System.out.println("\nSasuke utilizou shidori");
        });

        Ninja sakura = new Ninja("Sakura Haruno",12,"Namorar-Com-Naruto",()->{
            System.out.println("\nSakura usou a cura!\n");
        });

        naruto.mostrarDados();
        naruto.utilizarChacra();

        sasuke.mostrarDados();
        sasuke.utilizarChacra();

        sakura.mostrarDados();
        sakura.utilizarChacra();

        entrada.close();
    }
}
