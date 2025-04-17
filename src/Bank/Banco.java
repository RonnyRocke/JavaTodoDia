package Bank;
import java.util.Scanner;

public class Banco {
    private String nomeTitular;
    private double valorDepositoInicial;
    private  double saldoConta;
    private int numero;

    Scanner caixaDeTexto = new Scanner(System.in);

    public Banco(){}
    public Banco(final int numeroconta, String n, double v, final double s ){
        this.setNumero(numeroconta);
        this.setNomeTitular(n);
        this.setValorDepositoInicial(v);
        this.setSaldoConta(s);
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getValorDepositoInicial() {
        return valorDepositoInicial;
    }

    public void setValorDepositoInicial(double valorDepositoInicial) {
        this.valorDepositoInicial = valorDepositoInicial;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public double getImposto() {
        final double imposto = 5.00;
        return imposto;
    }

    public void info(){
        double saldo = 0;
        setSaldoConta(saldo);


        System.out.println("Enter account number: ");
        int accountNumber = caixaDeTexto.nextInt();
        setNumero(accountNumber);
        caixaDeTexto.nextLine();


        for(;;) {

            System.out.println("Enter account Holder: ");
            String name = caixaDeTexto.nextLine();
            setNomeTitular(name);

            System.out.println("\nIs there na initial deposit (y/n/s)? ");
               char opcao = caixaDeTexto.next().charAt(0);

                if (opcao == 'y' || opcao=='Y') {
                    System.out.println("Enter initial Deposit value: ");
                    double deposito = caixaDeTexto.nextDouble();
                    setValorDepositoInicial(deposito);
                    saldo = getValorDepositoInicial() + getSaldoConta();
                    setSaldoConta(saldo);


                    System.out.println("\nAccount data: ");
                    System.out.printf("\nAccount: %d, Holder: %s, Balance: $%.2f\n", getNumero(), getNomeTitular(), getSaldoConta());

                    System.out.println("\nEnter a deposit value: ");
                    deposito = caixaDeTexto.nextDouble();
                    setValorDepositoInicial(deposito);
                    saldo = getSaldoConta() + getValorDepositoInicial();
                    setSaldoConta(saldo);
                    System.out.println("Update account data: ");
                    System.out.printf("\nAccount: %d, Holder: %s, Balance: $%.2f\n", getNumero(), getNomeTitular(), getSaldoConta());

                    System.out.println("\nEnter a withdraw value: ");
                    double sacar = caixaDeTexto.nextDouble();
                    saldo = (getSaldoConta() - sacar) - getImposto();


                    if(getSaldoConta()<sacar || getSaldoConta()<getImposto()){
                       setSaldoConta(--saldo);
                        System.out.printf("\nSaldo-Negativo!\nDeposite Saldo!\n %.2f",getSaldoConta());
                    }
                    setSaldoConta(saldo);
                    System.out.println("\nUpdate account data: ");
                    System.out.printf("\nAccount: %d, Holder: %s, Balance: $%.2f\n", getNumero(), getNomeTitular(), getSaldoConta());

                } else if (opcao == 'n'||opcao=='N') {
                    setValorDepositoInicial(0);
                    System.out.println("\nAccount data: ");
                    System.out.printf("\nAccount: %d, Holder: %s, Balance: $%.2f\n", getNumero(), getNomeTitular(), getSaldoConta());

                    System.out.println("\nEnter a deposit value: ");
                    double deposito = caixaDeTexto.nextDouble();
                    setValorDepositoInicial(deposito);
                    saldo = getSaldoConta() + getValorDepositoInicial();
                    setSaldoConta(saldo);
                    System.out.println("Update account data: ");
                    System.out.printf("\nAccount: %d, Holder: %s, Balance: $%.2f\n", getNumero(), getNomeTitular(), getSaldoConta());

                    System.out.println("\nEnter a withdraw value: ");
                    double sacar = caixaDeTexto.nextDouble();
                    saldo = (getSaldoConta() - sacar) - getImposto();


                    if(saldo<=0 || saldo<getImposto()){
                        --saldo;
                        System.out.println("Saldo-Negativo!\nDeposite Saldo!");
                    }
                    setSaldoConta(saldo);
                    System.out.println("\nUpdate account data: ");
                    System.out.printf("\nAccount: %d, Holder: %s, Balance: $%.2f\n", getNumero(), getNomeTitular(), getSaldoConta());
                } else if(opcao=='s'||opcao=='S') {
                    System.out.println("\nObrigado Volte sempre ;)\n");
                    caixaDeTexto.close();
                    break;
                }
                else{
                    System.out.println("\nOpção Inválida!\n");
                }
        }
    }
}
