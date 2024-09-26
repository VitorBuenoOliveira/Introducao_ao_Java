package AulasJava3.Filas.Código;

public class FilaBanco {
    int inicio= 0;
    int fim = 0;
    int total = 0;
    Pessoa[] elementos;

    FilaBanco(int tamanhoMaximo){
        this.elementos = new Pessoa[tamanhoMaximo];
    }

        boolean cheia(){
            boolean estahCheia = false;
            if (total == elementos.length){
                estahCheia = true;
        }
        return estahCheia;
    }

    boolean enfileirar(Pessoa elem){
        if(!cheia()){
            elementos[fim] = elem;
            fim = (fim + 1) % elementos.length;
            total++;
        }
    }
}
