package Interfaces;

public class LimparDados implements RemoverInformation {

    @Override
    public void remover(){
        System.out.println("\nRemoveu Dados!");
    }
    @Override
    public void msg(){
        System.out.println("\nMSG Modificada!");
    }
}
