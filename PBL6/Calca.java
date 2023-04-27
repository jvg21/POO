public class Calca extends Roupa{
    public Calca(String nome,String marca, float preco,String cor, String tamanho){
        super(nome, marca, preco, cor, tamanho);
    }
    @Override
    public float calcularPrecoFinal(float acrescimo) {
        float precoFinal = (getPreco()+acrescimo)*(float)0.85;
        return precoFinal;
    }
}
