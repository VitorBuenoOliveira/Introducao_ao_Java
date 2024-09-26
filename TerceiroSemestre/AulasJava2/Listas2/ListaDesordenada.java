public class ListaDesordena{
    Pessoa[] dados;

    int quantidadeElementos=0;

    public ListaDesordenada(int tam){
        dados = new Pessoa[tam];
    }

    boolean temEspaco(){
        boolean tem = false;

        if(quantidadeElementos < dados.length){
            tem = true;
        }
        return tem;
    }

    boolean inserir(Pessoa p) {
        if(temEspaco() == true){
            dados[quantidadeElementos] = p;
            ++quantidadeElementos;
            return true;
        }
        return false;
    }

    boolean Pessoa removerUltimo(){
        int ultimoindice = quantidadeElementos;
        if(ultimoindice==quantidadeElementos.length){
            Pessoa ultimoindice = new Pessoa("", 0);
            inserir(ultimoindice)
        }
        return false;
    }
}