package Week4;

public class HW4Prob4 {
    public static void printRows1(int maxRows, int maxCols) {
        for(int row = 0; row < maxRows; row++) {
            for (int col = 0; col < maxCols; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printRows2(int maxRows, int maxCols) {
        for (int i = 1; i <= (maxRows * maxCols); i++){
            System.out.print("*");
            if ((i % maxCols) == 0) System.out.println();
        }
    }

    public static void main(String[] args) {
        printRows1(3,4);
        printRows2(5, 6);
    }

}
