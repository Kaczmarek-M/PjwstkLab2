//Pawel Murzyn - s19499
//Michal Kaczmarek - s18464

package Zad2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int ilosc;
        double cena;
        int wybor;

        Scanner scanner = new Scanner(System.in);
        InvoiceItem invoice = new InvoiceItem("1","faktura za buty", 12, 178);
        System.out.println("id: " + invoice.getId() + ", opis: " + invoice.getDesc() + ", ilosc: " + invoice.getQty() +
        ", cena jednostkowa: " + invoice.getUnitPrice() + "zl." + ", naleznosc koncowa: " + invoice.Total() + "zl.");

        for (int i = 0; i < 1; i++){
            System.out.println("\nJezeli chcesz zmienic ilosc lub cene jedneskowa to nacisnij 1\nJezeli nie to wcisnij 2");
            wybor = scanner.nextInt();
            if (wybor == 1){
                System.out.println("Podaj ilosc");
                ilosc = scanner.nextInt();
                invoice.setQty(ilosc);
                System.out.println("Podaj nowa cene jednostkowa");
                cena = scanner.nextInt();
                invoice.setUnitPrice(cena);
                System.out.println(invoice);
            }
            if (wybor == 2){
                System.out.println(invoice);
                return;
            }
        }
    }
}
