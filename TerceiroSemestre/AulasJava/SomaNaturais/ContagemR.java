package SomaNaturais;

public class ContagemR {
    public static void main(String[] args){
        // RegressivausandoFor(10);
        RegressivaRecursiva(10);
    }

    static int RegressivausandoFor(int n){
        for(int i = n;i>=0;i--){
            System.out.println(i+" ");
        }
        return n;
    }

    static void RegressivaRecursiva(int n){
        if(n<0){
            return;
        }else{
            System.out.println(n+", ");
            RegressivaRecursiva(n-1);
        }
    }
}
