/*Questão 1: Considere uma estrutura do tipo ListaEstatica,que usa um vetor de inteiros para armazenar
 * os dados presentes nela. Considerando a definição a seguir, implemente o método
 * soma valorespositivos(), que retorna a soma dos elementos maiores que zero que estão inseridos naquele
 * momento da lista.
*/

public class ListaEstatica(
    int[] valores;
    int tamanho;

    int somaValoresPositivos(){
        int soma=0;
        for(int i=0;i<tamanho;i++){
            if valores[i]>0{
                soma+=soma + valores[i];
            }
            return soma;
        }
    }
)//Correct