import br.unasp.Pessoa;

public class ListaLigada {
  Noh raiz;

  public void inserir(Pessoa p) {
      Noh temp = new Noh(p);
      temp.proximo = raiz;
      raiz = temp;
  }

  public void imprimir() {
      Noh percorre = raiz;
      while (percorre != null) {
          System.out.println(
              percorre.dado.nome + " " + 
              percorre.dado.idade + " " + 
              percorre.dado.fone + " " +
              percorre.dado.residencial
          );
          percorre = percorre.proximo;
      }
  }
}
