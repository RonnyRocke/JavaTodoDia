package OOP;

public abstract class Oop1 {
    // NÃO POSSO DEFINIR METODOS ABSTRATOS NA CLASSE ABSTRATA, APENAS DECLARAR
    String nome;

    public Oop1(String nome){
    this.nome = nome;
    }
    public Oop1(){
    //vazio
    }
    public abstract void carro();

    public static void main(String[]args){

        Oop2 carro1 = new Oop2("\nSaveiro");
        Oop3 carro2 = new Oop3("Celta");

        carro1.carro();
        carro2.carro();


    }
}
