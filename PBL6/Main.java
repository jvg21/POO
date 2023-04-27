public class Main {
    public static void main(String[] args) {
        Camisa camisa = new Camisa("Camisa Polo","Adidas",100f,"Branco","M");
        Calca calca = new Calca("Calca Jeans","Bivink",100f,"Preto","G");
        Vestido vestido = new Vestido("Vestido de Florzinha","Paraguai",100,"Amarelo","G");

        System.out.println(camisa.calcularPrecoFinal(5));
        System.out.println(calca.calcularPrecoFinal(5));
        System.out.println(vestido.calcularPrecoFinal(5));
    }
}