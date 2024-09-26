package SomaNaturais;

public class SomaN {
    // public static void main(String[] args){
    //     int lim =4;
    //     System.out.println(soma(lim));

    // }

    // public static long soma(long lim){
    //     if (lim == 1){
    //         return 1;
    //     }else{
    //         return lim + soma(lim-1);
    //     }
    // }

    public static void main(String[] args){
        int valorFor = 5;
        int valorRec = 5;
        System.out.println("ValorFor: "+somaUsandoFor(valorFor)+" ValorRec: "+somaUsandoRecursao(valorRec));
    }

    static int somaUsandoFor(int n){
        int somatoria = 0;

        for(int i =1;i<=n;i++){
            somatoria = somatoria+i;
        }
        return somatoria;
    }

    static int somaUsandoRecursao(int n){//Recursão chega a 0 e soma
        if(n==0){
            return 0;
        }else{
            return n + somaUsandoRecursao(n-1);
        }
    }
}
