package br.unasp;

/**
 * 
 * Sua resolucao deverah ser feita nesta classe.
 *
 */
public class Operacoes {

	
	
		/**
		 * 
		 * Retorna uma String contendo os nomes dos alunos, separados 
		 * por virgula e entre chaves, no seguinte formato:
		 * 
		 * {NOME1, NOME2}
		 * 
		 * Os nomes devem ser colocados na ordem em que aparecem no vetor.
		 * 
		 * Se o vetor estiver vazio ou nulo, retorne {}.
		 * 
		 */


		static String imprimir(Aluno[] classe) {
			if (classe == null || classe.length ==0){
				return "{}";
			}else{
				String saida = "{";
				for(int i=0;i<classe.length-1;i++){
					saida += classe[i].nome + ", ";
				}
				saida += classe[classe.length - 1].nome + "}";
				return saida
			
		}

		
		
		
		/**
		 * 
		 * Dado um aluno, calcula a media das notas dele e retorna 
		 * este valor encontrado.
		 * 
		 */
		static double calcularMedia(Aluno alu) {
			double[] notas = alu.notas; // Acessando diretamente o atributo 'notas' de Aluno
			
			double soma = 0;
			for (double nota : notas) {
				soma += nota;
			}
			return soma / notas.length;
		}
		

		
		/**
		 * 
		 * Dado um vetor representando os alunos de uma sala, 
		 * calcula a media de cada aluno e encontra o aluno de 
		 * maior media geral. Este aluno (INTEIRO) deve ser 
		 * retornado.
		 * 
		 */
		static Aluno encontrarMaiorMedia(Aluno[] classe) {
			if(classe == null || classe.length == 0){
				return null;
			}
			Aluno AlunoWHG = classe[0];
			double hg = AlunoWHG.calcmedia();

			for (int i = 1; i< classe.length;i++){
				double ca = classe[i].calcmedia();
				if(ca > hg){
					hg = ca;
					AlunoWHG = classe[i];
				}
			}
			return AlunoWHG;
		}
		
		
		
		/**
		 * 
		 * Verifica se um determinado RA existe numa classe de diversos 
		 * alunos. Caso exista, retorna true, senao, retorna false.
		 * 
		 * Se o vetor estiver vazio ou nulo, retorna false.
		 * 
		 */
		static boolean existeAlunoRA(Aluno[] classe, int ra) {
			if(classe == null || classe.length == 0){
				return false;
			}

			for(int i = 0;i<classe.length;i++) {
				if(classe[i].RA == ra){
					return true;
				}
			}
			return false;// se terminar o loop do for e não tiver nenhum Ra correspondente ele ira printar isto
		}
		
		
		
		/**
		 * 
		 * Dado um vetor de alunos, representando uma classe e uma 
		 * certa nota de corte, retorna os nomes de todos os alunos 
		 * que teriam sido aprovados baseado em suas medias.
		 * 
		 * Seguir a formatacao da funcao imprimir.
		 * 
		 */
		static String aprovados(Aluno[] classe, double notaCorte) {
			String resultado = ""; // Variável para acumular os nomes dos alunos aprovados

			for(Aluno aluno : classe){
				if(aluno.calcularMedia()>notaCorte){
					// Adiciona o nome do aluno ao resultado
					resultado += aluno.nome + ", ";
				}
			}
			if(!resultado.isEmpty()){
				// Remove a vírgula e o espaço extra no final da string
				resultado = resultado.substring(0,resultado.length()-2);
			}

			return "{"+resultado+"}";
		}
	}
}
