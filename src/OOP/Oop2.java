package OOP;

public class Oop2 extends Oop1 {

    public Oop2(String nome){
        super(nome);
    }
    // DEFININDO O METODO ABSTRATO CARRO, POLIMORFISMO
    @Override
    public void carro(){
        System.out.println(nome+" Está Correndo!");
    }
}
