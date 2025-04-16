package OOP;

public class Oop3 extends Oop1 {

    public Oop3(String nome){
        super(nome);
    }

    @Override
    public void carro(){
        System.out.println(nome+" Está Correndo!");
    }
}
