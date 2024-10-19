import br.unasp.Pessoa;

public class Revisao {
    public static void main(String[] args) {
        // Testando a lista estática
        ListaEstatica lista = new ListaEstatica(10);

        // Criando objetos Pessoa com o construtor correto
        Pessoa p1 = new Pessoa("João", 30, new Telefone(19, 1111, 1111), new Endereco("Hortolandia","sla"));
        Pessoa p2 = new Pessoa("Maria", 25, new Telefone(19, 2222, 3333),new Endereco("Hortolandia","sla2"));

        lista.inserir(p1);
        lista.inserir(p2);

        lista.imprimir();

        // Testando a lista ligada
        ListaLigada ligada = new ListaLigada();
        ligada.inserir(p1);
        ligada.inserir(p2);

        System.out.println("===============");

        ligada.imprimir();
    }
}
