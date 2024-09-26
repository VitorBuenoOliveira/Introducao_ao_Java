package Prova;

public class Questão4 {
    Noh nohCabeca;

    boolean existeValor(int procurado){
        Noh percorre = nohCabeca;
        while(percorre!=null){
            if(percorre.valor==procurado){
                return true;
            }
            percorre = percorre.proximo;
        }
        return false;
    }
}
