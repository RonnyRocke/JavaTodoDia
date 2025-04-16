package Projeto;

import java.io.Serializable;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import java.util.OptionalInt;

public class UserTest {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        User u = new User("Ronny");

        boolean inicio = true;

        do{
            u.desenho();
            System.out.print("\nDigite uma Opção: ");
            int opt = sc.nextInt();

            switch(opt){

                case 1:
                    System.out.print("\nDigite uma Cor: ");
                    String color = sc.next();
                    u.setCor(color);
                    String cor = u.getC();

                    System.out.printf("\nCor Escolhida: %s\n",cor);

                    System.out.println("\nDeseja Continuar (s/n): ");
                    char continuar = sc.next().charAt(0);

                    if(continuar=='s'){
                        continue;
                    }
                    else if(continuar=='n'){
                        inicio=false;
                        break;
                    }
                    else{
                        System.out.print("\nOpção Inválida! ");
                    }
                    break;

                case 2:
                    System.out.printf("%s",u.toString());

                    System.out.println("\nDeseja Continuar (s/n): ");
                    continuar = sc.next().charAt(0);

                    if(continuar=='s'){
                        continue;
                    }
                    else if(continuar=='n'){
                        inicio=false;
                        break;
                    }
                    else{
                        System.out.print("\nOpção Inválida! ");
                    }

                    break;

                case 3:
                    inicio=false;
                    break;

                case 4:
                    System.out.println("\nDigite um valor: ");
                    int cash = sc.nextInt();
                    Serializable m = u.money(OptionalInt.of(cash));
                    System.out.printf("%.2f",m);

                    System.out.println("\nDeseja Continuar (s/n): ");
                    continuar = sc.next().charAt(0);

                    if(continuar=='s'){
                        continue;
                    }
                    else if(continuar=='n'){
                        inicio=false;
                        break;
                    }
                    else{
                        System.out.print("\nOpção Inválida! ");
                    }

                    break;

                case 5:

                    String v = "\nLista contem elementos";
                    String f = "\nLista vazia";
                    List<String>listando=new ArrayList<String>();

                    System.out.print("\nDigite nome para cada elemento: ");
                    String a1 = sc.next();
                    String a2 = sc.next();
                    String a3 = sc.next();
                    String a4 = sc.next();

                    listando.add(a1);
                    listando.add(a2);
                    listando.add(a3);
                    listando.add(a4);
                    int tamList = listando.size();

                    List li = u.lists(listando);

                    for(int i=0; i<li.size();i++){
                        System.out.printf("\n%s", li.get(i));
                    }


                    System.out.printf("\n\nTamanho Da Lista: %d",tamList);

                    if(tamList>0) {
                        while (!listando.isEmpty()) {
                            System.out.printf("\n%s", v);
                            break;
                        }
                    }
                    else{
                        System.out.printf("\n%s", f);
                    }
                    break;

                default:
                    System.out.println("\nOpção invalida!");

                    System.out.println("\nDeseja Continuar (s/n): ");
                    continuar = sc.next().charAt(0);

                    if(continuar=='s'){
                        continue;
                    }
                    else if(continuar=='n'){
                        inicio=false;
                        break;
                    }
                    else{
                        System.out.print("\nOpção Inválida! ");
                    }


                    break;
            }
        }while(inicio);

        sc.close();
    }
}
