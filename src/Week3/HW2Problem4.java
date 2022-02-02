package Week3;
import java.text.DecimalFormat;

public class HW2Problem4 {
    public static void main(String[] args) {
        double current_day_miles = 10;
        double total_miles = 0;
        int dayCount = 1;
        DecimalFormat format = new DecimalFormat("#0.000");
        do {
            total_miles += current_day_miles;
            System.out.println("In day " + dayCount + ", the family travelled " + format.format(current_day_miles) + " miles and" +
                    " travelled a total of " + format.format(total_miles) + " miles");
            current_day_miles *= 0.7;
            dayCount++;
        }while(current_day_miles >= 0.1);
    }
}
