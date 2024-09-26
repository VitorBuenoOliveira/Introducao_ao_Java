public class Endereco {
    String cidade;
    String bairro;

        @Override
    public String toString() {
        return String.format("%d-%d", cidade,bairro);
    }
}
