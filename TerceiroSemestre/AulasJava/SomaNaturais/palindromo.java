package SomaNaturais;

public class palindromo {
        public static void main(String[] args) {
            System.out.println(PalindromeChecker.isPalindromeWhile("hello")); // true
            System.out.println(PalindromeChecker.isPalindromeWhile("hello"));   // false
        }

        public class PalindromeChecker {

            public static boolean isPalindromeWhile(String word) {
                int leftIndex = 0;
                int rightIndex = word.length() - 1;
        
                while (leftIndex < rightIndex) {
                    if (word.charAt(leftIndex) != word.charAt(rightIndex)) {
                        return false;
                    }
                    leftIndex++;
                    rightIndex--;
                }
        
                return true;
            }
        }

        public static boolean isPalindromeRecursiva(String word){
            if(word.length() <=1){
                return true;
            }
            int leftIndex = 0;
            int rightIndex = word.length()-1;   
            if(word.charAt(leftIndex) != word.charAt(rightIndex)){//chatAt pega o valor da letra no local aonde se encontra na string
                return false;
            }
            return isPalindromeRecursiva(word.substring(leftIndex+ 1,rightIndex));
        }
}
