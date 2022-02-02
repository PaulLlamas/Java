package Week2;
import java.util.Scanner;
public class AskUser {
    public static void main(String[] args) {
        boolean done = false;
        double total = 0;
        int count = 0;

        Scanner input = new Scanner(System.in);

        while (!done){
            System.out.print("Enter a numbber or q to quit: ");
            String txt = input.next();
            if (txt.equals("q")){
                done = true;
            } else {
                total += Double.parseDouble(txt);
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Average is " + total);
        } else {
            System.out.println("Average is zero");
        }
    }
}
