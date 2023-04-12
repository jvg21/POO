import java.util.Random;
public class Campeao {
    private int id;
    private String nome;
    private int hp;
    private int ataque;
    private int defesa;

    public Campeao(String nome, int hp, int ataque, int defesa){
        id = 0;
        this.nome = nome;
        this.hp = hp;
        this.ataque = ataque;
        this.defesa = defesa;

    }

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }

    public int getHp() {
        return hp;
    }

    public int getAtaque() {
        return ataque;
    }
    public int getDefesa(){
        return defesa;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void calculaDano(int dano){
        Random rand = new Random();
        dano = dano - this.defesa - rand.nextInt(5);
        if (getHp()<=0){
            System.out.println(this.getNome()+" Já está morto");
            return;
        }
        if (dano<0) {
            dano = 1 + rand.nextInt(3);
            setHp(hp-dano);
        } else {
            setHp(hp-dano);
        }
        System.out.println(this.getNome()+" recebeu "+dano+" de dano");
        if(getHp()<=0){
            System.out.println(this.getNome()+ "Morreu");
        }
    }
    public int atacar(){
        Random rand = new Random();
        int dano = this.ataque + rand.nextInt(15);
        return dano;
    }
    public void imprimir(){
        if(this.getHp()>0){
            System.out.println("Id:"+getId()+" Nome: "+getNome()+" - Vida: "+getHp()+" - Ataque: "+getAtaque()+" - Defesa: "+getDefesa());
        }

    }
}
