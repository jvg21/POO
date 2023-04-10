import java.util.ArrayList;
public class Carrinho {
    private ArrayList<Livro> livros;
    private ArrayList<Videogame> videogames;
    private ArrayList<Camisa> camisas;
    private ArrayList<Sapato> sapatos;
    private ArrayList<Televisao> televisoes;
    private float valorTotal;

    public Carrinho(){
        livros = new ArrayList<>();
        videogames = new ArrayList<>();
        camisas = new ArrayList<>();
        televisoes = new ArrayList<>();
        sapatos = new ArrayList<>();
        valorTotal = 0f;

    }

    public float getValorTotal(){
        return valorTotal;
    }

    public void addVideogame(Videogame videogame){
        videogames.add(videogame);
        System.out.println("O Videogame "+videogame.getModelo()+"foi adicionado");
    }
    public void addTelevisao(Televisao televisao){
        televisoes.add(televisao);
        System.out.println("A televisão "+televisao.getFabricante()+"foi adicionado");
    }
    public void addCamisa(Camisa camisa){
        camisas.add(camisa);
        System.out.println("A camisa "+camisa.getMarca()+"  "+camisa.getModelo()+" Tamanho: "+camisa.getTamanho()+"foi adicionado");
    }
    public void addSapato(Sapato sapato){
        sapatos.add(sapato);
        System.out.println("O sapato "+sapato.getMarca()+" "+sapato.getModelo()+" Tamanho: "+sapato.getTamanho()+"foi adicionado");
    }
    public void addLivro(Livro livro){
        livros.add(livro);
        System.out.println("O sapato "+livro.getTitulo()+"foi adicionado");
    }

    public void calculaValor(){

        for(var livro: livros){
            this.valorTotal+= livro.getPreco();
        }
        for(var sapato: sapatos){
            this.valorTotal+= sapato.getPreco();
        }
        for(var camisa: camisas){
            this.valorTotal+= camisa.getPreco();
        }
        for(var videogame: videogames){
            this.valorTotal+= videogame.getPreco();
        }
        for(var televisao: televisoes){
            this.valorTotal+= televisao.getPreco();
        }
    }

    public void imprimirRecibo(){
        System.out.println("============================================================================");
        System.out.println("================================RECIBO======================================");

        if(livros.size() !=0 ){
            float total = 0f;
            for(var livro: livros){
                total+= livro.getPreco();
            }
            System.out.println(livros.size()+" X Livro - Total: R$"+total);

        }
        if(videogames.size() !=0 ){
            float total = 0f;
            for(var videogame: videogames){
                total+= videogame.getPreco();
            }
            System.out.println(videogames.size()+" X Videogame - Total: R$"+total);

        }
        if(televisoes.size() !=0 ){
            float total = 0f;
            for(var televisao: televisoes){
               total+= televisao.getPreco();
            }
            System.out.println(televisoes.size()+" X Televisão - Total: R$"+total);

        }
        if(sapatos.size() !=0 ){
            float total = 0f;
            for(var sapato: sapatos){
                total+= sapato.getPreco();
            }
            System.out.println(sapatos.size()+" X Sapatos - Total: R$"+total);

        }
        if(camisas.size() !=0 ){
            float total = 0f;
            for(var camisa: camisas){
                total+= camisa.getPreco();
            }
            System.out.println(camisas.size()+" X Camisas - Total: R$"+total);

        }
        System.out.println("==========================================================");
        System.out.println("Valor Total: "+this.valorTotal);
        System.out.println("==========================================================");
    }
}
