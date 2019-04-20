//Pawel Murzyn - s19499
//Michal Kaczmarek - s18464

package Zad4;

public class Date {
    private int day;
    private int mounth;
    private int year;

    public Date(int day , int mounth, int year) {
        this.day = day;
        this.mounth = mounth;
        this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMounth(int mounth) {
        this.mounth = mounth;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", mounth=" + mounth +
                ", year=" + year +
                '}';
    }
}
