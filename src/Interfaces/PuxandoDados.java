package Interfaces;

import java.util.List;
import java.util.ArrayList;

public class PuxandoDados implements Information{

    @Override
   public void load(){

     List<String>nomes=new ArrayList<String>();

     nomes.add("\nFlávio");
     nomes.add("Natanael");
     nomes.add("Fernanda");
     nomes.add("Luíz");

     for(String nome:nomes){
         System.out.println(nome);
     }
    }
}
