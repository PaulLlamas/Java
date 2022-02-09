package Week5;

public class IteratingThruArray {
    public static void main(String[] args) {
        double[] array = {1.1, 2.2, 3.3, 4.4};

        for (int index = 0; index < array.length; index++) {
            array[index] += 10;
            System.out.print(array[index] + " ");
        } System.out.println();
        int index = 0;
        while (index < array.length) {
            array[index] += 10;
            System.out.print(array[index] + " ");
            index++;
        }
        System.out.println();
        for (double item : array) {
            item += 10;
            System.out.print(item + " ");
        }System.out.println();
        for (index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }System.out.println();
    }
}
