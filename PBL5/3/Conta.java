public class Conta {
    private float saldo;

    public Conta(float saldo){
        this.saldo = saldo;
    }
    public void mostraSaldo(){
        System.out.println("Saldo: "+saldo);
    }

    public void depositar(float valor){
        saldo += valor;
    }

    public float getSaldo() {
        return saldo;
    }
}
