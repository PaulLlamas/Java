package Week5;
import java.util.Arrays;
public class TryArrays {
    public static void main(String[] args) {
        int[] myArray = new int[3];
        int myArray2[] = new int[2];
        int[] myArray3 = {100, 200 , 300, 400};
        BankAccount[] account = {new BankAccount("Suzy"), new BankAccount("Timmy")};
        System.out.println(Arrays.toString(account));
//        System.out.println(Arrays.toString(myArray));
//        myArray[1] = 10;
//        System.out.println(Arrays.toString(myArray));
//        int x = myArray[1] + 50;
//        System.out.println(x);
//        System.out.println(Arrays.toString(myArray3));
        System.out.println(myArray3.length);
        System.out.println("The last thing in myArray3 is " + myArray3[myArray3.length - 1]);
    }
}
