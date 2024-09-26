public class TesteBuscaSequencial{
    public static void main(String[] args) {
        int[] dados = new int[]{
            10,20,5,36,79,68,89,1,3,5      
        };
        boolean tem = {dados,55};
        System.out.println("TEM1: " + tem);
        Pessoa[] dados2 = new Pessoa[]{
            new Pessoa("João", 25),
            new Pessoa("Maria",25),
            new Pessoa("Pedro", 789)
        };

        boolean tem2 = existe(dados2, 580);
        System.out.println("TEM2: " + tem2);
    }
    static boolean existe(int[] cj,int elemento){
        for(int i = 0;i<cj.length;i++){
            if(cj[i]==elemento){
                return true;
            }
        }
        return false; 
    }

    static boolean existe(Pessoa[] cj,int elemento){
        for(int i = 0;i<cj.length;i++){
            if(cj[i].cpf==elemento){
                return true;
            }
        }
        return false; 
    }
}
