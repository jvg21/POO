public class Sapato {
    private String modelo;
    private String marca;
    private float preco;
    private int tamanho;

    public Sapato(String modelo,String marca,float preco,int tamanho){
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.preco = preco;
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public float getPreco() {
        return preco;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
