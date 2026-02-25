package Oops;

class Atm {
    private int balance;

    public Atm(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {

        Atm atm = new Atm(100);

        System.out.println("Initial Balance: " + atm.getBalance());

        atm.deposit(50);

        System.out.println("Updated Balance: " + atm.getBalance());
    }
}
