public class Loja{
    static Produto encontrarProdutoMaisCaro(Produto[] lista){
        if(lista ==  null){
            return null;
        }

        Produto maisCaro = lista[0];
        
        for(int i = 1;  i < lista.length;i++){
            if(lista[i] !=null){
                if(lista[i].preco > maisCaro.preco){
                    maisCaro = lista[i];
                }
            }    
        }
        return maisCaro;
    }
}