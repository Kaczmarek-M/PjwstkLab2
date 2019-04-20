//Pawel Murzyn - s19499
//Michal Kaczmarek - s18464

package Zad4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Date date = new Date(0,0,0);
        int dzien;
        int miesiac;
        int rok;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            System.out.println("Podaj dzien");
            dzien = scanner.nextInt();
            if ((dzien >= 1) && (dzien <= 31)) {
                date.setDay(dzien);
            } else {
                System.out.println("Niepoprawny dzien\nPodaj dzien ponownie");
                i--;
            }
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("Podaj miesiac");
            miesiac = scanner.nextInt();
            if ((miesiac >= 1) && (miesiac <= 12)) {
                date.setMounth(miesiac);
            } else {
                System.out.println("Niepoprawny miesiac\nPodaj miesiac ponownie");
                i--;
            }
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("Podak rok");
            rok = scanner.nextInt();
            if ((rok >= 1900) && (rok <= 9999)) {
                date.setYear(rok);
            } else {
                System.out.println("Niepoprawny rok\nPodaj rok ponownie");
                i--;
            }
        }
        System.out.println(date);
    }
}
