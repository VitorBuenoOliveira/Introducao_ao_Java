package Fibonacci;

public class Fibonacci {
    /*
     * F(n)=F(n-1)+(Fn-2).
     * F(0)=0
     * F(1)=1.
     * 
     * 
     */

        static long fibonacci(long n){
            if(n==0){
                return 0;
            }else if(n==1){
                return 1;
            }else{
                return fibonacci(n-1) + fibonacci(n-2);
            }

        }
        public static void main (String s[]){
            long n = Long.parseLong(s[0]);
            long fib = fibonacci(n);
            System.out.println(fib);
            //     Fibonacci t = new Fibonacci();
            //     for(int i = 0; i<10;i++){
            //         System.out.println(t.fibonacci(i));
            // }
        }
        
}
