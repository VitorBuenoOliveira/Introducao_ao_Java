package AlgoritmoRecursivo;

public class AlgoritmoRecursivo {


    public static void main(String[] args){
        long fat = fatorial(5);
        System.out.println(fat);

        
    }
    static long fatorial(long n){
        if (n==0){
            return 1;
        }else{
            return n * fatorial(n-1);
        }
    }
    
    // * Reduzir um problema em partes menos
    // * Método da "divisão e conquista"
    // * Um problema simples é mais facíl de resolver
}
