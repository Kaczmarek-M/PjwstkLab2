//Pawel Murzyn - s19499
//Michal Kaczmarek - s18464

package Zad1;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private float salary;

    public Employee(int id, String firstName, String lastName, float salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + lastName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getAnnualSalary() {
        return salary * 12;
    }

    public void raiseSalary(float percent) {
        float wynik;
        percent = percent / 100;
        wynik = salary * percent;
        salary = salary + wynik;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id= " + id +
                ", name= " + getName() +
                ", salary= " + salary +
                '}';
    }
}