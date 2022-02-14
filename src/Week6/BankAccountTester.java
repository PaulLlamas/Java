package Week6;

public class BankAccountTester {
    public static void main(String[] args) {
        SavingsAccount tommyAccount = new SavingsAccount("Tommy", .15);
        System.out.println(tommyAccount);
        tommyAccount.deposit(125.25);
        System.out.println(tommyAccount);
        tommyAccount.deposit(10);
        System.out.println(tommyAccount);

        BankAccount acct = new SavingsAccount("Person", 0.09);
        acct.deposit(100);
        acct.deposit(100);
        System.out.println(acct);

//        SavingsAccount savingVar = new BankAccount("Person2");
    }
}
