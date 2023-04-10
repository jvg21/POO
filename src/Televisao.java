public class Televisao {
    private String fabricante;
    private int tamanho;
    private boolean smart = false;
    private String canal;
    private float preco;

    public Televisao(String fabricante,int tamanho, boolean smart,String canal,float preco){
        this.fabricante = fabricante;
        this.tamanho = tamanho;
        this.smart = smart;
        this.canal = canal;
        this.preco = preco;
    }

    public String getFabricante(){
        return fabricante;
    }

    public int getTamanho() {
        return tamanho;
    }

    public String getCanal() {
        return canal;
    }

    public boolean isSmart() {
        return smart;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void mudarCanal(String canal) {
        System.out.println("Tocando Canal: "+this.canal+", por: "+canal);
        this.canal = canal;
    }
    
}
