public abstract class Roupa implements Produto {
    private String nome;
    private String marca;
    private float preco;
    private String cor;
    private String tamanho;

    public Roupa(String nome,String marca, float preco,String cor, String tamanho){
        this.preco = preco;
        this.cor = cor;
        this.marca = marca;
        this.nome = nome;
        this.tamanho = tamanho;
    }
    public abstract float calcularPrecoFinal(float acrescimo);

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getMarca(){
        return marca;
    }
    @Override
    public float getPreco(){
        return preco;
    }

    @Override
    public void setPreco(float preco) {
        this.preco = preco;
    }
}
