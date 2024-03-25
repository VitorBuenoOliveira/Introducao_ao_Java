package SomaVetores;

public class SomaVetores {
    public static void main(String[]args){

        int[] vet = new int[]{
            10,30,50
        };
        imprimeVetor(vet);
        // int size = vet.length; Para Ver o tamanho do Vetor
        // System.out.println(size);
        
    }
        static void imprimeVetor(int[] v){
            int soma = 0;
            for (int i=0 ;i<v.length;i++){
                System.out.println(" "+v[i]);

            }
            for(int i =0;i < v.length;i++ ){
               soma += v[i];    
            }
            System.out.println("A soma dos valores do vetor é "+soma);
    }
}
