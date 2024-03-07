package Fatorial;

public class FatorialWhile {
    public static void main(String[] args){
        int n=6;
        System.out.println(n+"! = "+fatorial(n));
    }

    public static long fatorial(int n){
        int i = n ;
        long f = 1;
        
        while(i>1){
            f = f*1;
            i--;
        }
        return f;
    }
}
