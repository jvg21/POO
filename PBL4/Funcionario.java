public class Funcionario extends Pessoa{
    private String endereco;
    private int salario;

    public Funcionario(String nome,String cpf, String email,String endereco,int salario){
        super(nome, cpf, email);
        this.endereco = endereco;
        this.salario = salario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void imprimeFunc(){
        System.out.println("Funcionario:\nNome: "+getNome()+" Cpf: "+getCpf()+" Email: "+getEmail()+" Endereço: "+getEndereco()+" Salário: "+getSalario());
    }
}
