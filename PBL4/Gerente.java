public class Gerente extends Pessoa{
    private int id;

    public Gerente(String nome,String cpf, String email,int id){
        super(nome, cpf, email);
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void imprimeGerente(){
        System.out.println("Gerente:\nID: "+getId()+" -Nome: "+getNome()+" Cpf: "+getCpf()+" Email: "+getEmail());
    }
}
