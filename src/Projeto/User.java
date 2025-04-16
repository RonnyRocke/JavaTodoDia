package Projeto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;

public class User implements Caracteristicas {

    private String c;
    private String n;
    private String lista;

    User(){

    }
    User(String n){
        this.n =n;
    }

    Serializable money(OptionalInt m){
        OptionalInt total;
        total = m;
        return (double)total.getAsInt();
    }

    @Override
    public void desenho() {
        System.out.println("\n*******************");
        System.out.println("Bem-Vindo\n1: Digite uma cor\n2: Ver-Dados \n3: Sair\n4: Adicione um valor\n5: Adicione Elementos\n");
        System.out.println("*******************");

    }

    @Override
    public List<String> lists(List<String>lista) {
        return lista;
    }

    @Override
    public String getN(){
        return n;
    }

    @Override
    public void setCor(String c){
        this.c=c;
    }

    public String getC() {
        return c;
    }

    @Override
    public List<String>getList(){
        return Collections.singletonList(lista);
    }


    @Override
     public String toString(){ // ler tudo
        return "\nCor: "+getC()+"\nNome: "+getN()+"\n"+"\nTamanho da Lista: "+getList().size()+"\nElementos: "+getList();
    }
}
