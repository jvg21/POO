public class Livro {
    private String titulo;
    private int paginas;
    private String autor;
    private String editora;
    private int capitulos;
    private float preco;

    public Livro(String titulo,String autor,String editora,int paginas,int capitulos,float preco){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.paginas = paginas;
        this.capitulos = capitulos;
        this.preco = preco;

    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public String getEditora(){
        return editora;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public int getPaginas() {
        return paginas;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
