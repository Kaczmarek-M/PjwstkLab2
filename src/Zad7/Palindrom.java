//Pawel Murzyn - s19499
//Michal Kaczmarek - s18464

package Zad7;

public class Palindrom {
    /*
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Podaj wyraz");
        str = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        char c = 0;
        for(int i = str.length() - 1; i >= 0; i--){
            str.charAt(i);
            if (Character.isLetterOrDigit(c)){
                stringBuilder.append(str);
            }
        }
        if (stringBuilder.reverse().toString().equals(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
    */
    private static boolean isPalindrome1(String firstWord) {
        String workingCopy = removeCopy1(firstWord);
        String reversedCopy = rev(workingCopy);

        return reversedCopy.equalsIgnoreCase(workingCopy);
    }
    private static String removeCopy1(String firstWord) {
        int i, length = firstWord.length();
        StringBuilder sb = new StringBuilder(length);
        char c;

        for (i = (length - 1); i >= 0; i--) {
            c = firstWord.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    private static String rev(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);

        return stringBuilder.reverse().toString();
    }
    public static void main(String[] args) {
        String firstWord = "Wody zal dla zydow.";
        //String secendWord = "Atak kata";
        //String thirdWord = "Muzo, raz daj jad za rozu.";
        System.out.println();
        System.out.println(firstWord + "\n");
        //System.out.println(secendWord + "\n");
        //System.out.println(thirdWord + "\n");


        if (isPalindrome1(firstWord)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome!");
        }
        System.out.println();
    }
}