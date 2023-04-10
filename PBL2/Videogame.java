public class Videogame {
    private String modelo;
    private String fabricante;
    private String jogo;
    private float preco;

    public Videogame(String modelo,String fabricante,String jogo,float preco){
        this.jogo = jogo;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.preco = preco;
    }
    public String getJogo() {
        return jogo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void trocarJogo(String jogo) {
        System.out.println("Tocando Jogo: "+this.jogo+", por: "+jogo);
        this.jogo = jogo;
    }

}
