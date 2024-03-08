public class Binaria {

    public static String baseBinaria(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        if (decimal == 1) {
            return "1";
        }
        int quociente = decimal / 2;
        int resto = decimal % 2;
        return baseBinaria(quociente) + resto;
    }

    public static void main(String[] args) {
        System.out.println(baseBinaria(12)); //1100
        System.out.println(baseBinaria(15)); //1111
        System.out.println(baseBinaria(91));//1011011
    }
}