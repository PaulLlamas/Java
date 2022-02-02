package Week2;
import java.util.Scanner;
public class ValidatingInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double value;
        do {
            System.out.println("Please enter a positive number: ");
            value = in.nextDouble();
        } while (value >= 0);
    }
}
