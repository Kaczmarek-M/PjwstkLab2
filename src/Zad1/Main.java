//Pawel Murzyn - s19499
//Michal Kaczmarek - s18464

package Zad1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int raise;
        Scanner scanner = new Scanner(System.in);
        Employee person = new Employee(1,"Marek","Dywanik",12000);
        System.out.println("id: " + person.getId() + ", imie: " + person.getFirstName() + ", nazwisko: " + person.getLastName() +
        ", pensja: " + person.getSalary() + "zl." + ", zarobki roczne: " + person.getAnnualSalary() + "zl.");
        System.out.println("Podaj podwyzke (procentowo)");
        raise = scanner.nextInt();
        person.raiseSalary(raise);
        System.out.println(person);
    }
}
