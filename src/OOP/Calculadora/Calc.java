package OOP.Calculadora;
import java.util.Scanner;

public class Calc {
    private int valor;
    private int valor2;
    private int result;



    public Calc(){}

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void conta(){
       Scanner scan=new Scanner(System.in);

        for(;;){
            System.out.printf("\nDigite uma operação + - * / s(sair)\n");
            char ope = scan.next().charAt(0);
            if (ope=='s'){
                break;
            }

            switch (ope){

                case '+':

                    System.out.printf("\nDigite dois valores: ");
                    setValor(scan.nextInt());
                    setValor2(scan.nextInt());
                    setResult(getValor()+getValor2());
                    System.out.printf("%nResult: %d%n",getResult());
                    break;
                case '-':

                    System.out.printf("\nDigite dois valores: ");
                    setValor(scan.nextInt());
                    setValor2(scan.nextInt());
                    setResult(getValor()-getValor2());
                    System.out.printf("%nResult: %d%n",getResult());
                    break;

                case '*':

                    System.out.printf("\nDigite dois valores: ");
                    setValor(scan.nextInt());
                    setValor2(scan.nextInt());
                    setResult(getValor()*getValor2());
                    System.out.printf("%nResult: %d%n",getResult());
                    break;

                case '/':

                    System.out.printf("\nDigite dois valores: ");
                    setValor(scan.nextInt());
                    setValor2(scan.nextInt());
                    setResult(getValor()/getValor2());
                    System.out.printf("%nResult: %d%n",getResult());
                    break;

                default:
                    break;
                 }
            }
        }
}
