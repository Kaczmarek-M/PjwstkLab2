//Pawel Murzyn - s19499
//Michal Kaczmarek - s18464

package Zad6;

public class Workers {
    private int id;
    private String name;
    private int salary;
    private String dateOfJoining;


    Workers(int id, String name, int salary, String dateOfJoining) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
    }

    @Override
    public String toString() {
        return "Workers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dateOfJoining='" + dateOfJoining + '\'' +
                '}';
    }
}
