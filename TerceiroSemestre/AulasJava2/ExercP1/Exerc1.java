/*
 * Considerando a seguinte definição de função, imprima todos os números pares definidos o parâmetro vInicial e o segundo parâmetro vFinal, incluindo
 * ambos na operação.
 */

package AulasJava2.ExercP1;

public class Exerc1 {
    // public static void main(String[] args){
    //     int vInicial = Integer.parseInt(args[0]);
    //     int vFinal  = Integer.parseInt(args[1]);

    //     for(int i = vInicial;i<=vFinal;i++){
    //         if(i%2==0){
    //             System.out.println(i+", ");
    //         }
    //     }    
    // }

    public static void main(String[] args){
        int vInicial = 0;
        int vFinal = 50;
        imprimeIntervalo(vInicial,vFinal);
    }

    public static void imprimeIntervalo(int vInicial , int vFinal){
        for(int i=vInicial;i<=vFinal;++i){
            if(i%2 == 0){
                System.out.println(i+" ");
            }
        }
    }
}
