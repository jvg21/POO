public class Mapa {
    private String nome;
    private int tamanho;

    public Mapa(String nome,int tamanho){
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public int getTamanho() {
        return tamanho;
    }
}
