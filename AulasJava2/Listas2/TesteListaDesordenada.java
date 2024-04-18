package AulasJava2.Listas2;

public class TesteListaDesordenada {
    public static void main(String[] args) {
        ListaDesordenada lista = new ListaDesordenada(3);

        Pessoa a = new Pessoa("Marcelo", 20);
        Pessoa b = new Pessoa("Maria" , 30);
        Pessoa c =  new Pessoa("Jose", 40);
        Pessoa d = new Pessoa("Pedro", 50);

        lista.inserir(a);
        lista.inserir(b);
        lista.inserir(c);
        lista.inserir(d);
    }


}
