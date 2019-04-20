//Pawel Murzyn - s19499
//Michal Kaczmarek - s18464

package Zad6;

import java.util.ArrayList;

public class Main extends Workers {
    public Main(int id, String name, int salary, String dateOfJoining) {
        super(id, name, salary, dateOfJoining);
    }

    public static void main(String[] args) {

        Workers pawel = new Workers(1, "Pawel", 19000, "01.12.2016");
        Workers michal = new Workers(2, "Michal", 15000, "12.11.2010");
        Workers natalia = new Workers(3, "Natalia", 10000, "04.11.2011");
        Workers daria = new Workers(4, "Daria",20000, "10.10.2010");
        Workers kamil = new Workers(5, "Kamil", 19000,"20.10.2018");
        Workers stanislaw = new Workers(6, "Stanislaw", 16500, "21.10.2015");
        Workers anna = new Workers(7, "Anna", 18700, "19.10.2009");
        Workers dariusz = new Workers(8, "Dariusz", 12000, "13.12.2017");

        ArrayList<Workers> list = new ArrayList<>();
        list.add(pawel);
        list.add(michal);
        list.add(natalia);
        list.add(daria);
        list.add(kamil);
        list.add(stanislaw);
        list.add(anna);
        list.add(dariusz);
        for (Workers str : list) {
            System.out.println(str);

        }
    }
}
