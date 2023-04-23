import java.util.ArrayList;
import java.util.Collections;

public class Calculadora {

    public static int somar(int a,int b ){
        return a+b;
    }
    public static int somar(ArrayList<Integer> lista){
        int resultado = 0;
        for(Integer num:lista){
            resultado += num;
        }
        return resultado;
    }
    public static int subtrair(int a,int b){
        return a-b;
    }
    public static int subtrair(ArrayList<Integer> lista){
        int resultado = lista.get(0);
        for(int i = 1;i<lista.size();i++){
            resultado +=lista.get(i);
        }
        return resultado;
    }

    public static int multiplicar(int a,int b){
        return a*b;
    }
    public static ArrayList<Integer> multiplicar(ArrayList<Integer> lista,int multiplicador){
        ArrayList<Integer> lista2 = new ArrayList<>();
        for (int num:lista){
            lista2.add(num*multiplicador);
        }
        return lista2;
    }
    public static float dividir(int a,int b){
        float resultado = ((float)a)/((float)b);
        return resultado;
    }
    public static float dividir(ArrayList<Integer> lista){
        int par = 0;
        int impar = 0;
        float resultado = 0;
        for (int i = 0 ;i<lista.size();i++){
            if(i%2==0){
                par += lista.get(i);
            }else{
                impar +=lista.get(i);
            }
        }
        resultado = ((float)impar)/((float) par);
        return resultado;
    }
}
