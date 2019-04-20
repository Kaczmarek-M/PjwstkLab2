//Pawel Murzyn - s19499
//Michal Kaczmarek - s18464

package Zad7;

import java.util.Scanner;

public class Palindrom {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Podaj wyraz");
        str = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        if (stringBuilder.reverse().toString().equals(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}