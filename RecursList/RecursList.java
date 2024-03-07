package RecursList;

public class RecursList {
    // S={2,4,8,16,32}
    public static void main(String[] args){
        long numero = multiplica(5);
        System.out.println(numero);
    }
    public static long multiplica(long n){
        if (n ==1){
            return 2;
        }else{
            return 2 * multiplica(n-1);//Fatorial multiplica
        }

    }
}
