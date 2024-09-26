public class Telefone {
    int ddd;
    int prefixo;
    int mcdu;

    public Telefone(int d, int p , int m){
        this.ddd = d;
        this.prefixo =  p;
        this.mcdu = m;
    }

    @Override
    public String toString() {
        return String.format("(%d) %d-%d", ddd, prefixo, mcdu);
    }
}
