package Funcoes;

public class Funcoes {
    public static void main(String[] args){
        int valorA=10;
        int valorB =20;
        int resultado = somar(valorA,valorB);
        
        System.out.println(valorA);
        System.out.println(valorB);
        System.out.println(resultado);
    }
    static int somar (int a, int b){
        return a + b;
    }
}