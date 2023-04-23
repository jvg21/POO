
public class ContaPoupanca extends Conta{

    public ContaPoupanca(float saldo){
        super(saldo);
    }
    @Override
    public void mostraSaldo() {
        double saldo = Math.round(getSaldo()*100.0)/100.0;
        System.out.println("Saldo Poupança: "+saldo);

    }
}
