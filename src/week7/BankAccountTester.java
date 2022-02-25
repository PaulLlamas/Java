package week7;

import java.util.Arrays;

public class BankAccountTester {
    public static void main(String[] args) {
//        SavingsAccount tommyAccount = new SavingsAccount("Tommy", .15);
//        System.out.println(tommyAccount);
//        tommyAccount.deposit(125.25);
//        System.out.println(tommyAccount);
//        tommyAccount.deposit(10);
//        System.out.println(tommyAccount);
//
//        BankAccount acct = new SavingsAccount("Person", 0.09);
//        acct.deposit(100);
//        acct.deposit(100);
//        System.out.println(acct);

        BankAccount[] accts = {new BankAccount("Suzy", 1234, 2000),
                new BankAccount("Suzy", 1234, 0),
                new BankAccount("Tommy", 1234, 2000)};
        System.out.println(Arrays.toString(accts));
        Arrays.sort(accts);
        System.out.println(Arrays.toString(accts));

//        SavingsAccount savingVar = new BankAccount("Person2");
    }
}
