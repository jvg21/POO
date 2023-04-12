import java.util.ArrayList;
import java.util.Scanner;

public class Partida {
    private ArrayList<Time> times;
    private Mapa mapa;
    private boolean partidaValida;
    public Partida(Mapa mapa, Time time1, Time time2){
        if (time1.isTimeAtivo() && time2.isTimeAtivo()){
            this.mapa = mapa;
            times = new ArrayList<>();

            definirID(time1,time2);
            times.add(time1);
            times.add(time2);
            partidaValida = true;
        }else {
            System.out.println("Times inválidos. Cada Time precisa ter 5 campeoes ativos ");
            partidaValida = false;
        }

    }
    public boolean comecarPartida(){
        if(partidaValida == false){
            System.out.println("Partida inválida");
            return false;
        }
        //imprimeTimes();
        ArrayList<Campeao> time1;
        ArrayList<Campeao> time2;
        time1 = times.get(0).getCampeoes();
        time2 = times.get(1).getCampeoes();

        while (times.get(0).isTimeAtivo() && times.get(1).isTimeAtivo()) {

            for (int i = 0; i < 5; i++) {
                Scanner scanner = new Scanner(System.in);
                imprimeTimes();
                int alvo;

                if(time1.get(i).getHp()>0){
                    System.out.println("\033[0;31m"+"Vez de:"+time1.get(i).getNome()+"\n"+time1.get(i).getNome() + " Defina o id do seu alvo: ");
                    alvo = scanner.nextInt();
                    if (alvo>10){
                        System.out.println("Errou");
                    }else {
                        for (Campeao cmp : time2) {
                            if (cmp.getId() == alvo) {
                                cmp.calculaDano(time1.get(i).atacar());
                            }
                        }
                    }
                }else {
                    System.out.println("\033[0;31m"+time1.get(i).getNome() +" Já está morto, Turno passou");
                }

                if(time2.get(i).getHp()>0 ){
                    System.out.println("\033[0;34m"+"Vez de:"+time2.get(i).getNome()+"\n"+time2.get(i).getNome() + " Defina o id do seu alvo: ");
                    alvo = scanner.nextInt();
                    if (alvo>10){
                        System.out.println("Errou");
                    }else {
                        for (Campeao cmp : time1) {
                            if (cmp.getId() == alvo) {
                                cmp.calculaDano(time2.get(i).atacar());
                            }
                        }

                    }
                }else {
                    System.out.println("\033[0;34m"+time2.get(i).getNome() +" Já está morto, Turno passou");
                }

                if(times.get(0).isTimeAtivo() == false || times.get(1).isTimeAtivo() == false){
                    break;
                }
            }
        }
        verificaGanhador();
        return false;
    }
    public void verificaGanhador(){
        if(times.get(0).isTimeAtivo()){
            System.out.println("\033[0;30m"+times.get(0).getNome()+" Ganhou");
        }else{
            System.out.println("\033[0;34m"+times.get(1).getNome()+"Ganhou");
        }
    }
    public void imprimeTimes(){
        for (Time time:times){
            time.imprimeTime();
        }
    }

    public void definirID(Time time1, Time time2){
        int id = 1;
        for (Campeao cmp: time1.getCampeoes()){
            cmp.setId(id);
            id++;
        }
        for (Campeao cmp2: time2.getCampeoes()){
            cmp2.setId(id);
            id++;
        }
    }

}
