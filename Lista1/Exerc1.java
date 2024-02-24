// 1) Considere um “produtório” como o resultado da multiplicação de um conjunto de
// números entre eles mesmos. Crie uma função que recebe como parâmetro de entrada
// um vetor de números inteiros e retorna o resultado da multiplicação de todos os
// números positivos entre si.

package Lista1;

public class Exerc1 {
    public static void main(String[] args){
        int[] numeros1 = {1,2,3};
        int[] numeros2 = {10,20,8};
        int[] numeros3 = {-10,20,-8,2};
        
        System.out.println("O valor total é: "+Mult(numeros1));
        System.out.println("O valor total é: "+Mult(numeros2));
        System.out.println("O valor total é: "+Mult(numeros3));
}

        public static int Mult(int[] numeros){
            int resultado = 1;
            for(int num:numeros){
                if(num>0){
                    resultado *= num;
                }
            }
            return resultado;
        }
    }
