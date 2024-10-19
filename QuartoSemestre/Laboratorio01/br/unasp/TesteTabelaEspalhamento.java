package br.unasp;

public class TesteTabelaEspalhamento {
    public static void main(String[] args) {
        // Criação da tabela de espalhamento com tamanho 10
        TabelaEspalhamento tabela = new TabelaEspalhamento(10);

        // Criação de algumas pessoas
        Pessoa p1 = new Pessoa();
        p1.cpf = "12345678901";
        p1.nome = "João";
        p1.idade = 25;

        Pessoa p2 = new Pessoa();
        p2.cpf = "23456789012";
        p2.nome = "Maria";
        p2.idade = 30;

        Pessoa p3 = new Pessoa();
        p3.cpf = "34567890123";
        p3.nome = "Carlos";
        p3.idade = 22;

        // Teste de inserção
        System.out.println("Inserindo pessoas:");
        System.out.println("Inserção de João: " + tabela.inserir(p1)); // Deve retornar true
        System.out.println("Inserção de Maria: " + tabela.inserir(p2)); // Deve retornar true
        System.out.println("Inserção de Carlos: " + tabela.inserir(p3)); // Deve retornar true
        System.out.println("Tentativa de inserir João novamente: " + tabela.inserir(p1)); // Deve retornar false

        // Teste de existência
        System.out.println("\nVerificando existência:");
        System.out.println("João existe? " + tabela.existe("12345678901")); // Deve retornar true
        System.out.println("Maria existe? " + tabela.existe("23456789012")); // Deve retornar true
        System.out.println("Carlos existe? " + tabela.existe("34567890123")); // Deve retornar true
        System.out.println("Pessoa inexistente existe? " + tabela.existe("99999999999")); // Deve retornar false

        // Teste de recuperação
        System.out.println("\nRecuperando pessoas:");
        System.out.println("Recuperando João: " + tabela.recuperar("12345678901").nome); // Deve retornar "João"
        System.out.println("Recuperando Maria: " + tabela.recuperar("23456789012").nome); // Deve retornar "Maria"
        System.out.println("Recuperando Carlos: " + tabela.recuperar("34567890123").nome); // Deve retornar "Carlos"
        System.out.println("Recuperando pessoa inexistente: " + tabela.recuperar("99999999999")); // Deve retornar null

        // Teste de remoção
        System.out.println("\nRemovendo pessoas:");
        System.out.println("Remoção de João: " + tabela.remover("12345678901")); // Deve retornar true
        System.out.println("João existe após remoção? " + tabela.existe("12345678901")); // Deve retornar false
        System.out.println("Remoção de Maria: " + tabela.remover("23456789012")); // Deve retornar true
        System.out.println("Maria existe após remoção? " + tabela.existe("23456789012")); // Deve retornar false
        System.out.println("Remoção de pessoa inexistente: " + tabela.remover("99999999999")); // Deve retornar false
    }
}
