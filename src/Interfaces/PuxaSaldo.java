package Interfaces;

public class PuxaSaldo implements Information {

    float saldo;

    PuxaSaldo(){
       //construtor padrão
    }
    PuxaSaldo(float saldo){
        this.saldo=saldo;
    }

    @Override
    public void load(){
        System.out.printf("\nSaldo em Conta: $%.2f\n",saldo);
    }
}
