package Week5;

import java.util.Arrays;

public class UseElip {
    public static double fun(int init, double... numbers ) {
        double total = init;
        System.out.println(Arrays.toString(numbers));
        for ( double d : numbers ) total += d;
        return total / numbers.length;
    }

    public static void main(String[] args) {
        System.out.println(fun(1));
    }
}
