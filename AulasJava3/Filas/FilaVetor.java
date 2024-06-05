package AulasJava3.Filas;

public class FilaVetor {
    int inicio  = 0;
    int fim = 0;
    int total = 0;
    int elementos;

    FilaVetor(int tam){
        elementos = new int[tam];
    }


    // void imprimir(){
    //     for(int i = 0; i< total; ++i){
    //         int pos =  (inicio + i ) % elementos.length;
    //         System.out.println(elementos[pos]+", ");
    //     }
    //     System.out.println();
    // }

    boolean vazia(){
        boolean estahVazia = false;
        if(total == 0){
            estahVazia = true;
        }
        return false;
    }

    boolean cheia(){
        boolean estahCheia = false;
        if(total == elementos.length){
        }
    }

    void enfileirar(int elem){
        if(!cheia()){
            elementos[fim] = elem;
            fim = (fim+1)% elementos.length;
            ++total;
        }
    }

    int desenfileirar() {
        int valor = 0;
        if (!vazia()){
            valor = elementos[inicio];
            inicio = (inicio + 1 )% elementos.length;
            --total;
        }
    }
}
