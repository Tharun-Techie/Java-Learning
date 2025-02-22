package HarishOOPS;

class Balance{
    private double balance;

    double showBalance(){
        return balance;
    }

        void updateBalance(double amt){
        balance = balance + amt;
//        return balance;
    }
}

public class BankAccount {

    public static void main(String[] args) {
        Balance user1 = new Balance();
        user1.updateBalance(100);
        user1.updateBalance(-50);
        user1.updateBalance(-26);
        user1.updateBalance(700);




        System.out.println("User Balance: "+user1.showBalance()+" Rs");
    }
}
