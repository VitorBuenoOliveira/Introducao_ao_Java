package Introducao_ao_Java.AulasJava2.Telefone;

public class Telefone2{
    public static void main(String[] args){
        Pessoa p = new Pessoa();
        p.nome = "Marcelo";
        p.idade = 29;
        p.tel[0] = new telefone();
        p.tel[0].ddd = 11;
        p.tel[0].numero = "2233";

        p.tel[1] = new telefone();
        p.tel[1].ddd = 22;
        p.tel[1].numero = "4455";
        // Pessoa t = new Pessoa();
        // t.nome = "Maria";
        // t.idade = 40;
        // t.tel[0] = new telefone();
        // t.tel[0].ddd = 22; 
        // t.tel[0].numero = "4433";

        imprimir(p);
    }
    static void imprimir(Pessoa pes){
        System.out.println(pes.nome);
        System.out.println(pes.idade);
        for(int i =0;i<pes.tel.length;++i){
            System.out.println(pes.tel[i].ddd+pes.tel[i].numero);
        }
    }
}