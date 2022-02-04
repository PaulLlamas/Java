package Week4;
import java.util.Scanner;
public class HWTester {
    public static void printRows2(int maxRows, int maxCols) {
        for (int i = 1; i <= (maxRows * maxCols); i++){
            System.out.print("*");
            if ((i % maxCols) == 0) System.out.println();
        }
    }

    public static void main(String[] args) {
            printRows2(5,8);
        }
}
