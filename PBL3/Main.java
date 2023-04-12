public class Main {
    public static void main(String[] args) {
        Campeao campeao1 = new Campeao("Bruno",20,14,12);
        Campeao campeao2 = new Campeao("Guilherme",13,12,10);
        Campeao campeao3 = new Campeao("Gabriel",18,20,13);
        Campeao campeao4 = new Campeao("João",21,12,12);
        Campeao campeao5 = new Campeao("Giovanni",14,10,10);
        Campeao campeao6 = new Campeao("Nikólas",16,14,9);
        Campeao campeao7 = new Campeao("Rafa",15,13,12);
        Campeao campeao8 = new Campeao("Barcelona",20,10,10);
        Campeao campeao9 = new Campeao("Basso",12,17,15);
        Campeao campeao10 = new Campeao("Junior",10,4,2);

//        campeao1.imprimir();
//        campeao2.imprimir();
//        campeao2.calculaDano(campeao1.atacar());
//        campeao2.imprimir();

        Time time1 = new Time("Time Vermelho");
        Time time2 = new Time("Time Azul");

        time1.addCampeao(campeao1);
        time1.addCampeao(campeao2);
        time1.addCampeao(campeao3);
        time1.addCampeao(campeao4);
        time1.addCampeao(campeao5);
        time2.addCampeao(campeao6);
        time2.addCampeao(campeao7);
        time2.addCampeao(campeao8);
        time2.addCampeao(campeao9);
        time2.addCampeao(campeao10);

        Mapa mapa = new Mapa("Dessfiladeiro",20);

        Partida partida = new Partida(mapa,time1,time2);
        partida.comecarPartida();

    }


}