package Lista1;

public class Exerc2 {
    public static void main(String[] args){
        int[] vetor1_1 = {1,2,3};
        int[] vetor1_2 = {1,2,3};
        int[] vetor2_1 = {1,2};
        int[] vetor2_2 = {1,2,3};
        int[] vetor3_1 = {3,2,1};
        int[] vetor3_2 = {1,2,3};

        System.out.println(saoIguais(vetor1_1, vetor1_2));
        System.out.println(saoIguais(vetor2_1, vetor2_2));
        System.out.println(saoIguais(vetor3_1, vetor3_2));
    }

    public static boolean saoIguais(int[] vetor1, int[] vetor2){
        if (vetor1.length != vetor2.length){
            return false;
        }
        for(int i=0;i<vetor1.length;i++){
            if(vetor1[i]!=vetor2[i]){
                return false;
            }
        
        }
        return true;
    }
}
