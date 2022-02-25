package week7;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonAlg {
    public static boolean lessThanNumber(ArrayList<Integer> list, int topValue){
        for(Integer item: list){
            if(topValue > item){
                return true;
            }
        }
        return false;
    }
    public static boolean allLessThanNumber(ArrayList<Integer> list, int topValue){
        for(Integer item: list){
            if(topValue <= item){
                return false;
            }
        }
        return true;
    }
//    public static boolean howManyLessThanNumber(ArrayList<Integer> list, int topValue){
//        for(Integer item: list){
//            if(topValue <= item){
//                return false;
//            }
//        }
//        return true;
//    }
    public static int findMinimum(ArrayList<Integer> list){
        int currentMinimum = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if(currentMinimum > list.get(i)) currentMinimum = list.get(i);
        } return currentMinimum;
    }
    public static int findMaximum(ArrayList<Integer> list){
        int currentMaximum = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if(currentMaximum < list.get(i)) currentMaximum = list.get(i);
        } return currentMaximum;
    }

    public static void main(String[] args) {
        Integer[] x = {20, 2, -10, -3};
        ArrayList<Integer> testList = new ArrayList<>(Arrays.asList(x));
//        System.out.println(lessThanNumber(testList, 10));
//        System.out.println(allLessThanNumber(testList, 10));
        System.out.println(findMinimum(testList));
        System.out.println(findMaximum(testList));
    }
}
