package GenericSampleCode;

import java.util.Arrays;

public class BankTester {
    public static void main(String[] args) {
        BankAccount[] array = {new BankAccount("Suzy", 50),
                new BankAccount("Al", 50),
                new BankAccount("Robert", 10000)};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, (first, second) ->
                first.getOwner().compareTo(second.getOwner()));
        System.out.println(Arrays.toString(array));

    }
}
