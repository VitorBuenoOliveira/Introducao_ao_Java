public class TesteLoja {
    public static void main(String[] args){
        testeEncontrarProdutoMaisCaro1();
        testeEncontrarProdutoMaisCaro2();
        testeEncontrarProdutoMaisCaro3();
        testeEncontrarProdutoMaisCaro4();
        testeEncontrarProdutoMaisCaro5();

    }
    public static void testeEncontrarProdutoMaisCaro1(){
        Produto[] valores = new Produto[3];

        Produto p1 = new Produto();
        p1.nome = "Manga";
        p1.preco = 100;
        
        Produto p2 = new Produto();
        p2.nome = "Manga";
        p2.preco = 150;

        Produto p3 = new Produto();
        p3.nome = "Manga";
        p3.preco = 3;

        valores[0] = p1;
        valores[1] = p2;
        valores[2] = p3;

        Produto maisCaro = Loja.encontrarProdutoMaisCaro(valores);

        if (maisCaro != p2){
            System.err.println("[caso-1] Não encontrei a melancia");
        }else{
            System.out.println("[caso-1] Sucesso!");
        }
    }

    public static void testeEncontrarProdutoMaisCaro2(){
        Produto[] valores = new Produto[1];

        Produto p1 = new Produto();
        p1.nome = "Manga";
        p1.preco = 3;

        valores[0] = p1;

        Produto maisCaro = Loja.encontrarProdutoMaisCaro(valores);

        if (maisCaro != p1){
            System.err.println("[caso-2] Não encontrei a melao");
        }else{
            System.out.println("[caso-2] Sucesso!");
        }
    }

    public static void testeEncontrarProdutoMaisCaro3(){
        Produto[] valores = new Produto[3];

        Produto p1 = new Produto();
        p1.nome = "Manga";
        p1.preco = 100;
        
        Produto p2 = new Produto();
        p2.nome = "Manga";
        p2.preco = 100;

        Produto p3 = new Produto();
        p3.nome = "Manga";
        p3.preco = 100;

        valores[0] = p1;
        valores[1] = p2;
        valores[2] = p3;

        Produto maisCaro = Loja.encontrarProdutoMaisCaro(valores);

        if (maisCaro != p1){
            System.err.println("[caso-3] Não encontrei a melao");
        }else{
            System.out.println("[caso-3] Sucesso!");
        }
    }

    public static void testeEncontrarProdutoMaisCaro4(){
        Produto[] valores = new Produto[3];

        Produto maisCaro = Loja.encontrarProdutoMaisCaro(valores);

        if (maisCaro != null){
            System.err.println("[caso-4] Não devia ter ecnotrado nada.");
        }else{
            System.out.println("[caso-4] Sucesso!");
        }
    }

    public static void testeEncontrarProdutoMaisCaro5(){
        Produto[] valores = null;

        Produto maisCaro = Loja.encontrarProdutoMaisCaro(valores);

        if (maisCaro != null){
            System.err.println("[caso-5] Não devia ter encontrado nada");
        }else{
            System.out.println("[caso-5] Sucesso!");
        }
    }
}
