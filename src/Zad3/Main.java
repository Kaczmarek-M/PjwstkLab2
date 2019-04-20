package Zad3;

//Pawel Murzyn - s19499
//Michal Kaczmarek - s18464

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Account person1 = new Account("1", "Michal", 1000);
        Account person2 = new Account("2", "Slawek", 1200);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 1; i++) {
            int wybor;
            int kwota;
            System.out.println("Jezeli chcesz wziac kredyt nacisnij 1");
            System.out.println("Jezeli chcesz zaplacic karta nacisnij 2");
            System.out.println("Jezli chcesz dokonac przelewu nacisnij 3");
            System.out.println("Jezeli chcesz zakonczyc nacisnij 4");
            wybor = scanner.nextInt();
            if (wybor == 1) {
                System.out.println("Podaj kwote kredytu");
                kwota = scanner.nextInt();
                person1.credit(kwota);
            }
            if (wybor == 2) {
                System.out.println("Jezeli chcesz obiazyc konto nacisnij 2");
                kwota = scanner.nextInt();
                person1.debit(kwota);
            }

            if (wybor == 3) {
                System.out.println("Podaj kowote przelewu");
                kwota = scanner.nextInt();
                person1.transferTo(1, kwota);
            }
            if (wybor == 4) {
                return;
            }

            System.out.println(person1);
            System.out.println(person2);
        }
    }
}
