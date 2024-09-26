public class Collatz {
    public static void main(String[] args) {
        imprimeSeqCollatz(6);
        imprimeSeqCollatz(10);
        if (imprimeSeqCollatz(-100) < 0) {
            System.out.println(imprimeSeqCollatz(-100));
        }
        imprimeSeqCollatz(100);
    }

    public static int imprimeSeqCollatz(int n) {
        if (n <= 0) {
            System.out.println("Positivos.");
            return -1;
        }
        System.out.print(n + " ");
        if (n == 1) {
            return 1;
        }
        return imprimeSeqCollatz(n % 2 == 0 ? n / 2 : 3 * n + 1);
    }
}