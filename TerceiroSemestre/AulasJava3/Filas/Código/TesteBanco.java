package AulasJava3.Filas.Código;

public class TesteBanco {
    public static void main(String[] args){
        FilaBanco fila = new FilaBanco(3);

        Pessoa a  = new Pessoa("joao",33);
        fila.enfileirar(a);

        Pessoa b = new Pessoa("Maria",40);
        fila.enfileirar(b);
    }
}
