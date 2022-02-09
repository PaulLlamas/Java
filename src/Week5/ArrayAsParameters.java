package Week5;

public class ArrayAsParameters {

    public static int multiplyArrayElements(int[] numbers) {
        int product = 1;
        for (int number : numbers)
            product *= number;
        return product;
    }

    public static void main(String[] args) {
        int[] test = {2, 3, 4, 5, 6};
        System.out.println(multiplyArrayElements(test));
    }
}
