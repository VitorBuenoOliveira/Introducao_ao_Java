public class ApenasCaracteres {
    public static void main(String[] args) {
        ApenasCaracteres ac = new ApenasCaracteres();
       // System.out.println(ac.isNumero("123456")); // true
        System.out.println(ac.isNumero("123456A")); // false
        System.out.println(ac.isNumero("A983B")); // false
    }

    public boolean isNumero(String str) {
        if (str.isEmpty()) {
            return true;
        }
        if (str.charAt(0) < '0' || str.charAt(0) > '9') {
            return false;
        }
        return isNumero(str.substring(1));
    }
}