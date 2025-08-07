package DJava;

class Account {
    private double balance = 0;

    public double addBalance(double amount) {
        
        balance += amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }
}

public class Test {
    public static void main(String[] args) {
        Account patlu = new Account();

        System.out.println(patlu.getBalance());
        System.out.println(patlu.addBalance(15200));

    }
}
