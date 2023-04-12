import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private ArrayList<Campeao> campeoes;
    private boolean timeAtivo;


    public Time(String nome){
        this.nome = nome;
        campeoes = new ArrayList<>();
        timeAtivo = false;
    }

    public String getNome() {
        return nome;
    }

    public void addCampeao(Campeao cmp){
        if(campeoes.size() >= 5 ){
            System.out.println("Time "+getNome()+" Cheio");
        }else {
            timeAtivo = true;
            campeoes.add(cmp);
        }
    }
    public void imprimeTime(){
        System.out.println("\033[0m "+"------------"+getNome()+"---------------------------------");
        for(Campeao cmp:campeoes){
            cmp.imprimir();
        }
        //System.out.println(campeoes.size());
        System.out.println("---------------------------------------------");
    }

    public ArrayList<Campeao> getCampeoes(){
        return campeoes;
    }

    public boolean isTimeAtivo(){
        if (campeoes.size() == 5){
            for (Campeao cmp: campeoes){
                if(cmp.getHp()>0){
                    return true;
                }
            }
        }

        return false;
    }

}
