public class Main {
    public static void main(String[] args) {
        Videogame videogame1 = new Videogame("PS5","Sony","God of War",5000.00f);
        Videogame videogame2 = new Videogame("PS4","Sony","Fifa 23",2000.00f);
        Videogame videogame3 = new Videogame("XBOX Series X","Microsoft","Minecraft",3000.00f);

        Televisao televisao1 = new Televisao("LG",32,true,"Bandeirantes",1500f);

        Camisa camisa1 = new Camisa("Dry Fit","Nike",250f,"M");

        Sapato sapato1 = new Sapato("All Stars","All Stars",150f,40);

        Livro livro1 = new Livro("Harry Potter ea Ordem da Fenix","JK Rolling","Roco",700,30,120f);

        Carrinho carro = new Carrinho();

        carro.addCamisa(camisa1);
        carro.addSapato(sapato1);
        carro.addLivro(livro1);
        carro.addTelevisao(televisao1);
        carro.addVideogame(videogame1);
        carro.addVideogame(videogame2);
        carro.addVideogame(videogame3);

        carro.calculaValor();
        carro.imprimirRecibo();
        //System.out.println(carro.getValorTotal());

    }
}