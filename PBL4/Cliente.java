public class Cliente extends Pessoa{
    private int idade;
    private String telefone;

    public Cliente(String nome,String cpf, String email, int idade, String telefone){
        super(nome,cpf,email);
        this.idade = idade;
        this.telefone = telefone;

    }

    public int getIdade() {
        return idade;
    }
    public String getTelefone(){
        return telefone;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void imprimeCliente(){
        System.out.println("Cliente:\nNome: "+getNome()+"\nCpf: "+getCpf()+"\nEmail: "+getEmail()+"\nIdade: "+getIdade()+" Telefone: "+getTelefone());
    }
}
