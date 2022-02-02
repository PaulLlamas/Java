package Week4;

public class BankAccount {

    // Attributes
    private Person owner;
    private double balance;
    private int accountNumber;

    // Constructor
    public BankAccount(Person owner, int accountNumber) {
        this.owner = owner;
        this.balance = 0;
        this.accountNumber = accountNumber;
    }

    // other methods
    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient funds.");
    }

    //Print

    public String toString() {
        return owner + " has account " + accountNumber + " with balance " + balance;
    }

//    public static void main(String[] args) {
//        BankAccount suzyAccount = new BankAccount("Suzy", 1234);
//        System.out.println(suzyAccount);
//        suzyAccount.deposit(200);
//        System.out.println(suzyAccount);
//        suzyAccount.withdraw(100);
//        System.out.println(suzyAccount);
//    }
}

