import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(13);
        lista.add(4);
        lista.add(12);
        lista.add(1);

        System.out.println("Soma: "+Calculadora.somar(25,45));
        System.out.println("Subtração: "+Calculadora.subtrair(25,45));
        System.out.println("Multiplicação: "+Calculadora.multiplicar(25,45));
        System.out.println("Divisao: "+Calculadora.dividir(25,45));
        System.out.println("Soma lista: "+Calculadora.somar(lista));
        System.out.println("Subtração lista: "+Calculadora.subtrair(lista));
        System.out.println("Multiplicação lista: "+Calculadora.multiplicar(lista,2));
        System.out.println("Divisão lista: "+Calculadora.dividir(lista));
    }
}