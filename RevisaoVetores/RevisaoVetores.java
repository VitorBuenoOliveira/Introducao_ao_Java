package RevisaoVetores;

public class RevisaoVetores{
    public static void main(String[]args){
        int[] vet = new int[]{
            10,50,30,2,-1,-30,20
        };
        int maior = vet[0];
        for (int i=1 ;i<vet.length ;i++){
            if (maior < vet[i]){
                maior = vet[i];
            }
        }
         
         int somatoria = 0;
         for(int i = 0; i <vet.length;++i){
            somatoria = somatoria +vet[i];
         }
         System.out.println("O valor mais grande do vetor é: " + maior);
         System.out.println("O valor menor é: "+somatoria);
    }
}
