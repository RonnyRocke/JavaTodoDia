package DesafiosZap;

import java.util.*;

public class DesafioWhatsZap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<String> list = new ArrayList<String>();
        list.add("Cachorro");
        list.add("Boi");

        char letra = 'a';

        list.stream()
                .filter(palavra -> palavra.startsWith(String.valueOf(letra)))
                .forEach(palavra -> System.out.println("Letra Encontrada na Palavra " + palavra +": "+letra));

        sc.close();
    }
}
