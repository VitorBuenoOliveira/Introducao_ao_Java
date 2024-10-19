import br.unasp.Pessoa;

public class ListaEstatica {
  Pessoa[] dados;
  int indice = 0;

  public ListaEstatica(int tamanho) {
      dados = new Pessoa[tamanho];
  }

  public void inserir(Pessoa p) {
      if (indice < dados.length) {
          dados[indice] = p;
          indice++;
      }
  }

  public void imprimir() {
      for (int i = 0; i < indice; ++i) {
          System.out.println(
              dados[i].nome + " " + 
              dados[i].idade + " " + 
              dados[i].fone + " " +
              dados[i].residencial
          );
      }
  }
}
