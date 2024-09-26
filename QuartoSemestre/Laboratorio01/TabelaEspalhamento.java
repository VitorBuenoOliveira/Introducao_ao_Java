package br.unasp;

/**
 * 
 * Classe principal de implementacao do laboratorio. 
 * 
 * NAO ALTERE AS DEFINICOES DOS METODOS!
 *
 */
public class TabelaEspalhamento {
	/**
	 * 
	 * Onde os dados devem ficar salvos.
	 * 
	 */
	Elemento[] tabela;
	/**
	 * 
	 * Construtor da classe.
	 * 
	 * Recebe o tamanho inicial dos dados.
	 * 
	 */
	TabelaEspalhamento(int tamanho) {
		this.tabela = new Elemento[tamanho];
	}
	/**
	 * 
	 * Baseado na chave (o CPF da pessoa), deve gerar um indice inteiro
	 * para indicar em qual posicao essa pessoa deve ser salva na estrutura
	 * principal.
	 * 
	 * Dado um mesmo CPF, deve retornar sempre o mesmo indice.
	 * 
	 */
	int calcularHash(String cpf) {
		int hash = 0;
			for (int i = 0; i < cpf.length(); i++) {
				hash += cpf.charAt(i);
			}
			return hash % this.tabela.length;
		}
	}
	/**
	 * 
	 * Realiza a insercao da pessoa p na tabela de espalhamento. Deve retornar 
	 * true caso a operacao aconteca com sucesso, e false caso contrario.
	 * 
	 */
	boolean inserir(Pessoa p) {
		int indice = this.calcularHash(p.getCpf());
		if (this.tabela[indice] == null){
			this.tabela[indice] = new Elemento(p);
			return true;
			}else{
				return false;
			}
		}
	/**
	 * 
	 * Remove a pessoa da tabela de espalhamento que tenha este CPF. Deve retornar 
	 * true caso a operacao aconteca com sucesso, e false caso contrario.
	 * 
	 */
	boolean remover(String cpf) {
		int indice = this.calcularHash(cpf);
		if (this.tabela[indice] != null && this.tabela[indice].getPersona().getCpf().equals(cpf)){
			this.tabela[indice] = null
			return true;
			}else{
				return false;			
		}
	}
	/**
	 * 
	 * Verifica se o CPF existe na tabela de espalhamento, e retorna true 
	 * em caso positivo.
	 * 
	 */
	boolean existe(String cpf) {
		int indice = this.calcularHash(cpf);
		if (this.tabela[indice] != null && this.tabela[indice].getPersona().getCpf().equals(cpf)){
			return true;
			}else{
				return false;
			}
		}
	/**
	 * 
	 * Retorna a pessoa determinada pelo CPF caso exista ou entao retorna 
	 * null, indicando que nao existe uma pessoa com este CPF.
	 * 
	 */
	Pessoa recuperar(String cpf) {
		int indice this.calcularHash(cpf);
		if (this.tabela[indice] != null && this.tabela[indice].getPersona.getCpf().equals(cpf)){
			return this.tabela[indice].getPersona();
			}else{
				return null;
			}
}
