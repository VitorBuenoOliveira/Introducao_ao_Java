package Test.ConstructorWhile;
import java.util.Scanner;
public class ConstrutorWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        while(numero > 0) {
            if(numero % 2 == 0)
                System.out.println("Foi digitado o número Par " + numero);
            else
                System.out.println("Foi digitado o número Impar " + numero);
            System.out.println("Digite um numero Inteiro: ");
            numero = teclado.nextInt();        
        }
    
    }
}
