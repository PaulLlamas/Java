package Week5;

import java.util.ArrayList;
import java.util.Arrays;

;

public class ArrayReview {
    public static void main(String[] args) {
        double[] myArray = {10.2, 87.5, 95.2,123.465, 4564.546};
        System.out.println(Arrays.toString(myArray));

        for (int i = myArray.length-2; i>= 0; i--) {
            myArray[i] = myArray[i + 1];
            System.out.println(Arrays.toString(myArray));
        }

//        for (int i = 0; i <= myArray.length-2; i++) {
//            myArray[i] = myArray[i + 1];
//            System.out.println(Arrays.toString(myArray));
//        }

//        System.arraycopy(myArray, 1, myArray, 2, myArray.length - 2);
//        System.out.println(Arrays.toString(myArray));
//        myArray[1] = 1111;
//        System.out.println(Arrays.toString(myArray));
//        double[] temp = new double[myArray.length * 2];
//        System.arraycopy(myArray, 0, temp, 0, myArray.length);
//        myArray = temp;

//        System.out.println(myArray[2]);
//        System.out.println(Arrays.toString(myArray));
//        System.out.println(myArray[myArray.length - 1]);
//        myArray[0] = 451.45;
//        System.out.println(Arrays.toString(myArray));

        /*ArrayList<String> list = new ArrayList<>();
        list.add("hi");
        list.add("bye");
        list.add("sigh");

        System.out.println(list.contains("bye4"));

        for(String element : list){
            if (element.equals("bye")){
                System.out.println(true);
            }
        }*/
    }
}