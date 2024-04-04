package AulasJava2.ExercP1;
/*
 * Implemente uma função chamada calculaExponenciacao() que recebe como
 * parâmetros de entrada dois números inteiros, o primeiro indicando a basea ser usada
 * e o segundo o expoente da operação e retorna um número inteiro com o resultado
 * da operação base**expoente(base elavado ao expoente). Considere que o expoente será maior ou igual a zero
 * e que um número elevado a zero vale 1. O método deve ser recursivo.
 */
public class Exerc2 {
    public static void main(String[] args) {
        int base = 3;
        int expo = 4;
        System.out.println(elevado(base,expo));
    }

    

    public static long elevado(int base, int expo){
        if(expo== 0){
            return 1;
        }else{
            return base * elevado(base , expo-1);
            
        }
    }

    // int calculaExponeciacao(int base, int expo){
    //     if(expo ==0){
    //         return 1;
    //     }
    //     return base*calculaExponeciacao(base, expo-1);
    // }
}
