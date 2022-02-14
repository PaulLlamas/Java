package Week6;

public class BankAccount {

    private static int nextId = 100;

    // Attributes
    private static int numberOfAccounts = 0;
    private String owner;
    private double balance;
    private int accountNumber;

    // Constructor
    public BankAccount(String owner) {
//        this.owner = owner;
//        this.balance = 0;
//        this.accountNumber = nextId++;
        this(owner,nextId++, 0);
        numberOfAccounts += 1;
    }

    public BankAccount(String owner, int accountNumber, double money) {
        this.owner = owner;
        this.balance = money;
        this.accountNumber = accountNumber;
        numberOfAccounts += 1;
    }

    // other methods
    public static int getNumberOfAccounts(){return numberOfAccounts;}

    public void deposit(double amount){balance += amount;}

    public void withdraw(double amount){
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient funds.");
    }

    public boolean equals(Object obj){
        if (obj instanceof BankAccount){
            BankAccount otherAcct = (BankAccount) obj;
            return owner.equals(otherAcct.owner) &&
                    accountNumber == otherAcct.accountNumber &&
                    balance == otherAcct.balance;
        } else return false;
    }

    public double getBalance(){
        return balance;
    }

    public BankAccount copy() {return new BankAccount(owner, accountNumber, balance);}

    //Print

    public String toString() {return owner + " has account " + accountNumber + " with balance " + balance;}

//    public static void main(String[] args) {
//        BankAccount suzyAccount = new BankAccount("Suzy", 1234);
//        System.out.println(suzyAccount);
//        suzyAccount.deposit(200);
//        System.out.println(suzyAccount);
//        suzyAccount.withdraw(100);
//        System.out.println(suzyAccount);
//    }
}

