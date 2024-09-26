package AulasJava2.ExercP1.Exerc3;
/*
 * Dada a seguinte definição de uma função, imprima o nome de todos os alunos recebidos como parâmetro, cuja idade seja maior de 18.
 */
public class Testaluno {
    public static void main(String[] args){
        Aluno[] alunos = new Aluno[3];

        Aluno l1 = new Aluno();
        l1.nome = "gabriel";
        l1.idade = 30;

        Aluno l2 = new Aluno();
        l2.nome = "Fulano";
        l2.idade = 30;

        Aluno l3 = new Aluno();
        l3.nome = "Pedro";
        l3.idade = 21;

        alunos[0] = l1;
        alunos[1] = l2;
        alunos[2] = l3;
        // verif(alunos);
        trintou(alunos);
    }
    static void verif(Aluno[] alunos) {
        for(int i =0;i<alunos.length;i++){
            Aluno a = alunos[i];
            if (a.idade >= 18){
                System.out.println("O aluno é maior de 18 anos "+a.nome+" ("+a.idade+")");
            }
        }
    }
    static Aluno trintou(Aluno[] alunos){
        for(int i =0;i<alunos.length;i++){
            Aluno a = alunos[i];
            if (a.idade == 30){
                System.out.println(a.nome+a.idade);
                return a;
            }
        }
        return null;
    }
}
