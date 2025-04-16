package ExercicioYoutube;

public class ContaBancaria {
    private String nome;
    private String numeroDaConta;
    private String agencia;
    private double saldo;
    private boolean ativa;

    // setters
    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta=numeroDaConta;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    // getters

    public String getNome() {
        return nome;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    void mostraDados(){
        int limite = 0;
        System.out.printf("\nNome: %s",getNome());
        System.out.printf("\nNumero-Da-Conta: %s",getNumeroDaConta());
        System.out.printf("\nAgencia: %s",getAgencia());
        System.out.printf("\nSaldo: $%.2f",getSaldo());

        if(getSaldo()>limite){
            System.out.println("\nAtiva: "+isAtiva()+"\n");
        }
        else{
            boolean isNotativa= isAtiva();
            isNotativa =false;
            System.out.println("\nAtiva: "+isNotativa+"\n");

        }

    }
}
