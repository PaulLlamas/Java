package Week6;

import java.util.Arrays;
import java.util.Random;

public class Homework5_4 {
    public static int[] randomArray(int n, int top, int bottom){
        Random randomGenerator = new Random();
        int[] list = new int[n];
        list[0] = bottom;
        for(int i = 1; i < n - 2; i++){
            int num = randomGenerator.nextInt(top - bottom) + bottom;
            list[i] = num;
        }
        list[n - 1] = top;
        return list;
    }

    public static void main(String[] args) {
        Arrays.toString(randomArray(5,10, 2));
    }
}
