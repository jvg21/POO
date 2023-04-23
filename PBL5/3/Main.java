public class Main {
    public static void main(String[] args) {

        ContaCorrente corrente = new ContaCorrente(2500f);
        ContaPoupanca poupanca = new ContaPoupanca(1500.52f);
        Pessoa pes1 = new Pessoa("João",corrente);
        Pessoa pes2 = new Pessoa("Giovanni",poupanca);

        pes1.getConta().mostraSaldo();
        pes2.getConta().mostraSaldo();

        pes1.depositar(200f);
        pes2.depositar(125.45f);
        System.out.println("----------------------------------------------------------------");
        pes1.getConta().mostraSaldo();
        pes2.getConta().mostraSaldo();

    }
}