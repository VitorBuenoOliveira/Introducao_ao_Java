package Pares;
public class Pares{
    public static void main(String[] args){
        int ini = Integer.parseInt(args[0]);
        int Fim = Integer.parseInt(args[1]);

        for(int i = ini;i<=Fim;++i){
            if(i%2==0){
                System.out.println(i+", ");
            }
        }
    }
}