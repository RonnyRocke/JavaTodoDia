package Funcoes_De_String;

public class FuncoesDeString {

    public static void main(String[]args) {
        String variavel = "   abcDEFGHIJKLMNnoP";
        String s = "\nPotato apple lemon";
        String v[] = s.split(" ");
        System.out.println(v[0]);
        System.out.println(v[1]);
        System.out.println(v[2]);


        System.out.println("\nOriginal: "+variavel);

        System.out.println("\ntoUpperCase -- Letras Maiusculas:  "+variavel.toUpperCase());
        System.out.println("\ntoLowerCase -- Letras Minusculas: "+variavel.toLowerCase());
        System.out.println("\ntrim -- Removendo Espacos: "+variavel.trim());
        System.out.println("\nreplace -- troca os Caracteres: "+variavel.replace('a','L'));
        System.out.println("\nreplace -- troca Caracteres: "+variavel.replace("abc","noP"));
        System.out.println("\nindexOf -- Indice Das Letras: "+variavel.indexOf("DE"));
        System.out.println("\nsubstring -- Posicao do char da letra: "+variavel.substring(5)); //F
        System.out.println("\nsubstring: Posicao do char da letra: "+variavel.substring(2,5)); //c
    }
}
