package br.unasp;

/**
 * Classe principal de implementação do laboratório.
 * 
 * NÃO ALTERE AS DEFINIÇÕES DOS MÉTODOS!
 *
 */
public class TabelaEspalhamento {

    /**
     * Onde os dados devem ficar salvos.
     * 
     */
    Elemento[] tabela;

    /**
     * Construtor da classe.
     * 
     * Recebe o tamanho inicial dos dados.
     * 
     */
    TabelaEspalhamento(int tamanho) {
        this.tabela = new Elemento[tamanho];
    }

    /**
     * Baseado na chave (o CPF da pessoa), deve gerar um índice inteiro
     * para indicar em qual posição essa pessoa deve ser salva na estrutura
     * principal.
     * 
     * Dado um mesmo CPF, deve retornar sempre o mesmo índice.
     * 
     */
    int calcularHash(String cpf) {
        return Math.abs(cpf.hashCode()) % tabela.length; // Garante que o índice seja positivo
    }

    /**
     * Realiza a inserção da pessoa p na tabela de espalhamento. Deve retornar 
     * true caso a operação aconteça com sucesso, e false caso contrário.
     * 
     */
    boolean inserir(Pessoa p) {
        int indice = calcularHash(p.cpf); // Calcula o índice para o CPF
        Elemento novoElemento = new Elemento();
        novoElemento.pes = p; // Armazena a pessoa no novo elemento

        // Verifica se já existe um elemento nessa posição
        if (tabela[indice] == null) {
            tabela[indice] = novoElemento; // Insere o elemento se a posição estiver vazia
            return true;
        } else {
            // Tratamento de colisão: encadeamento
            Elemento atual = tabela[indice];
            while (atual.proximo != null) {
                if (atual.pes.cpf.equals(p.cpf)) {
                    return false; // CPF já existe
                }
                atual = atual.proximo; // Avança para o próximo elemento
            }
            if (atual.pes.cpf.equals(p.cpf)) {
                return false; // CPF já existe
            }
            atual.proximo = novoElemento; // Insere o novo elemento no final da lista
            return true;
        }
    }

    /**
     * Remove a pessoa da tabela de espalhamento que tenha este CPF. Deve retornar 
     * true caso a operação aconteça com sucesso, e false caso contrário.
     * 
     */
    boolean remover(String cpf) {
        int indice = calcularHash(cpf);
        Elemento atual = tabela[indice];
        Elemento anterior = null;

        while (atual != null) {
            if (atual.pes.cpf.equals(cpf)) {
                if (anterior == null) {
                    tabela[indice] = atual.proximo; // Remove o primeiro elemento
                } else {
                    anterior.proximo = atual.proximo; // Remove um elemento do meio
                }
                return true; // Remoção bem-sucedida
            }
            anterior = atual; // Avança o nó anterior
            atual = atual.proximo; // Avança para o próximo elemento
        }
        return false; // Não encontrou o CPF
    }

    /**
     * Verifica se o CPF existe na tabela de espalhamento, e retorna true 
     * em caso positivo.
     * 
     */
    boolean existe(String cpf) {
        int indice = calcularHash(cpf);
        Elemento atual = tabela[indice];

        while (atual != null) {
            if (atual.pes.cpf.equals(cpf)) {
                return true; // CPF encontrado
            }
            atual = atual.proximo; // Avança para o próximo elemento
        }
        return false; // CPF não encontrado
    }

    /**
     * Retorna a pessoa determinada pelo CPF caso exista ou então retorna 
     * null, indicando que não existe uma pessoa com este CPF.
     * 
     */
    Pessoa recuperar(String cpf) {
        int indice = calcularHash(cpf);
        Elemento atual = tabela[indice];

        while (atual != null) {
            if (atual.pes.cpf.equals(cpf)) {
                return atual.pes; // Retorna a pessoa
            }
            atual = atual.proximo; // Avança para o próximo elemento
        }
        return null; // Não encontrou
    }
}
