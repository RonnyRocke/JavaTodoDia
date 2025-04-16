package Projeto2;

public class Empresa {
    int tam=5;
    String cargo[]=new String[tam];

   public void mostrarVagas(){

       System.out.println("\n\tVagas: \n");
        cargo[0]="\tpadeiro";
        cargo[1]="\trepositor";
        cargo[2]="\tfrentista";
        cargo[3]="\tprogramador";
        cargo[4]="\tbabá";

        for (String Profissao:cargo){
            System.out.printf("%s\n",
                    Profissao);
        }

    }
}
