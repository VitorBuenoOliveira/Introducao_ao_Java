public class Pessoa {
    String nome;
    int idade;
    Telefone fone;
	Endereco residencial;
    public Pessoa(String nome, int idade, Telefone fone) {
        this.nome = nome;
        this.idade = idade;
        this.fone = fone;
    }

	void incluirEndereco(Endereco end){
		this.residencial = end;
	}
}
