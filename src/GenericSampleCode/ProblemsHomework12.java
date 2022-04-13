package GenericSampleCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProblemsHomework12 {
    public static <E extends Comparable> List<E> genericList(E[] array, E first, E last ){
        List<E> newArray = new ArrayList<>();
        int smallest = 0;
        int biggest = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i].compareTo(first) < 0) smallest = i;
            if(array[i].compareTo(last) < 0) biggest = i;
        }
        for(int index = smallest; index <= biggest; index++){
            newArray.add(array[index]);
        }
        return newArray;
    }

    public static void main(String[] args) {
        BankAccount[] array = {new BankAccount("Suzy", 50),
                new BankAccount("Al", 50),
                new BankAccount("Robert", 10000)};
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println(genericList(array, array[0], array[2]));

    }

}
