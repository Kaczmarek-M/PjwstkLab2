//Pawel Murzyn - s19499
//Michal Kaczmarek - s18464

package Zad3;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        balance = amount + balance;
        return balance;
    }
    public int debit(int amount) {
        if(amount <= balance){
            balance = balance - amount;
        }else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public int transferTo(int Account, int amount) {

        if (amount <= balance) {
            Account = balance + amount;
        }else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
