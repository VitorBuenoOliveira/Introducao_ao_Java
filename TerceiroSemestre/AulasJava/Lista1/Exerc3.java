package Lista1;

public class Exerc3 {
    public static void main(String[] args){
        int[] vetor1 = {1,2,3};
        int[] vetor2 = {3,2,1};
        int[] vetor3 = {1,2,3,7,2};

        System.out.println(Ordenado(vetor1));
        System.out.println(Ordenado(vetor2));
        System.out.println(Ordenado(vetor3));
    }   

    public static boolean Ordenado(int[] vetor){
        boolean Crescente = true;
        boolean Descrencente = true;

        for(int i =0;i < vetor.length-1;i++){
            if(vetor[i] > vetor[i + 1]){
                Crescente = false;
            }
            if(vetor[i] < vetor[i+1]){
                Descrencente = false;
            }
        }
        return Crescente || Descrencente;
    }
}
