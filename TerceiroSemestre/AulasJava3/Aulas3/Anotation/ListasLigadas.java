package AulasJava3.Aulas3.Anotation;

public class ListasLigadas {
    Noh raiz;
    void inserir(Pessoa p){
        Noh novo = new Noh();
        novo.pes = p;
        novo.proxima  = raiz;
        raiz = novo;
    }

    String imprimir(){
        String nomes = "";
        Noh percorre = raiz;
        while(percorre != null){
            nomes = nomes + raiz.pes.nome;
            percorre = percorre.proxima;
        }
    }
}

