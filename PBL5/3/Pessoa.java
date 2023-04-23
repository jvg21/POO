public class Pessoa {
    private String nome;
    private Conta conta;

    public Pessoa(String nome, Conta conta){
        this.nome = nome;
        this.conta = conta;
    }

    public void depositar(float valor){
        conta.depositar(valor);
    }

    public Conta getConta() {
        return conta;
    }
}
