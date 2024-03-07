package Fatorial;

public class Fatorial {
    public static void main(String[] args){
        int n = 5;
        System.out.println(n+"! = "+ fatorial(n));
    }

    public static long fatorial(int n){
        long f=1;

        for(int i =n;i>1;i--){
            f=f*i;
        }
        return f;
    }
}
