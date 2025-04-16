package Interfaces;

public interface RemoverInformation {

    public abstract void remover();

      public default void msg(){
          System.out.println("\nMostrando-Mensagem!");
      }
}
