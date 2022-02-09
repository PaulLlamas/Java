package Week4;

public class BalanceTester {
    public static void main(String[] args) {
        BankAccount suzyAcct = new BankAccount("Suzy");
        System.out.println(suzyAcct);
        BankAccount person2 = new BankAccount("Person 2");
        System.out.println(person2);
        BankAccount person3 = new BankAccount("Person 3");
        System.out.println(person3);
        BankAccount person4 = new BankAccount("Person 4");
        System.out.println(person4);
        System.out.println(BankAccount.getNumberOfAccounts());
        BankAccount person5 = person2.copy();
        person5.deposit(500.65);
        System.out.println(person2);
        System.out.println(person5);
    }
}
