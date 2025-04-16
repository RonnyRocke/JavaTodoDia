package Interfaces;

import java.util.Locale;

public class PuxaDadosTest {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);

        PuxandoDados pegardados = new PuxandoDados();
        PuxaSaldo pegarsaldo = new PuxaSaldo(1200.0F);
        // Information i = new PuxaSaldo();
        // RemoverInformation i2 = new LimparDados();
        LimparDados removerdados = new LimparDados();

        pegardados.load();
        pegarsaldo.load();
        // i.load();
        // i2.remover();
        // i2.msg();
        removerdados.remover();
        removerdados.msg();

    }
}
