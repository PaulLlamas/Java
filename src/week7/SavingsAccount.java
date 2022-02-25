package week7;

public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String owner, double interest){
        super(owner);
        interestRate = interest;
    }

    @Override
    public void deposit(double amount){
        super.deposit(amount + (interestRate * getBalance()));
    }

    @Override
    public String toString(){
        String out = super.toString() + " with an interest rate of " + interestRate;
        return out;
    }
}
