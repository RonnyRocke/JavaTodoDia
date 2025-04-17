package Bank;
import java.util.Locale;
public class BancoTest {

    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Banco bank1 = new Banco();
    Banco bank = new Banco(bank1.getNumero(), bank1.getNomeTitular(), bank1.getValorDepositoInicial(), bank1.getSaldoConta());

        bank.setSaldoConta(200); // não interfere, pois o saldo não modifica nessa lógica, pois ele se encontra no metodo .info
        bank.info();
    }
}
