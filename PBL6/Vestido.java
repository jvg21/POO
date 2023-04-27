public class Vestido extends Roupa{
    public Vestido(String nome,String marca, float preco,String cor, String tamanho){
        super(nome, marca, preco, cor, tamanho);
    }
    public float calcularPrecoFinal(float acrescimo) {
        float precoFinal = (getPreco()+acrescimo)*(float)0.80;
        return precoFinal;
    }
}
