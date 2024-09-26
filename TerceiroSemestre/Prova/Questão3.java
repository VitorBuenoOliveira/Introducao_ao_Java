package Prova;
/*O método retornaVetor() que retorna um vetor de inteiros contendo os elementos
 * presentes na lista ligada, cujo inicio é indicado pelo nohCabeca. se a lista estiver
 * vazia, retorne uma referencia nula
 */

 class Noh{
    int valor;
    Noh proximo;
}
public class Questão3 {
    Noh nohCabeca;
    int quantidadeElementos;

    int[] retonaVetor(){
        if quantidadeElementos == 0{
            return null;
        }

        int[] dados = new int[quantidadeElementos];
        int contador = 0;

        Noh percorre = nohCabeca;
        while(percorre!=null){
            dados[contador] = percorre.valor;
            ++contador;
            percorre = percorre.proximo;
        }
        return dados; 
    }
}
