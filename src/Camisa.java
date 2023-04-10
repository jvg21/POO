public class Camisa {
    private String modelo;
    private String marca;
    private float preco;
    private String tamanho;

    public Camisa(String modelo,String marca,float preco,String tamanho){
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

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
