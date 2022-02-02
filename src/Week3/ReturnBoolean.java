package Week3;

public class ReturnBoolean {

    public static boolean isOdd(int number) {
        if (number % 2 != 0) return true;
        else return false;
    }

    public static void main(String[] args) {
        if (isOdd(770)) System.out.println("It is odd!");
    }
}
