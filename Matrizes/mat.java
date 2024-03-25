package Introducao_ao_Java.Matrizes;

public class mat {
    public static void main(String[] args){
        Pessoa[] p = new Pessoa[5];
        p[0] = new Pessoa();
        p[0].nome = "Marcelo";
        p[0].idade = 25;

        p[1] = new Pessoa();
        p[1].nome = "Ana";
        p[1].idade = 30;
        
        p[2] = new Pessoa();
        p[2].nome = "Pedro";
        p[2].idade = 40;

        p[3] = new Pessoa();
        p[3].nome = "Carlos";
        p[3].idade = 10;

        p[4] = new Pessoa();
        p[4].nome = "José";
        p[4].idade = 90;

        encontraMaisVelho(p);
        encontraMaisNovo(p);
        imprimir(p);
    }
    // static int velho(Pessoa[] vetor){
    //     int MaiorIdade = vetor[0].idade ;
    //     int IndiceVelho = 0;
    //     for(int i=1;i<vetor.length;i++){
    //         if (vetor[i].idade > MaiorIdade){
    //             MaiorIdade = vetor[i].idade;
    //             IndiceVelho = i;
    //         }
    //     }
    //     System.out.println("O homem mais velho é "+(MaiorIdade));
    //     return IndiceVelho; 
    // } 
    static int encontraMaisVelho(Pessoa[] dados){
        int posicao = -1;
        int idadeMaisVelha = -1;

        for(int i =0;i<dados.length;i++){
            if(dados[i].idade > idadeMaisVelha){
                posicao = i;
                idadeMaisVelha = dados[i].idade;
            }
        }
        return posicao;
    }

    static Pessoa encontraMaisNovo(Pessoa[] dados1){
        int posicao = 0;
        int idadeMaisNova = dados1[0].idade; // ou Integer.Max_Value;

        for(int i = 0;i<dados1.length;i++){
            if(dados1[i].idade < idadeMaisNova) {   
                posicao = i;
                idadeMaisNova = dados1[i].idade;
            }
        }
        return dados1[posicao];
    }

    static void imprimir(Pessoa[] dado){
        for(int i=0;i<dado.length;i++){
            System.out.println(dado[i].nome+" "+dado[i].idade);
        }
    }
}
