package week10;

import java.util.*;

public class TrLinkedList {
    public static void addNumber(List<Double>  list){
//        List<Double> lst = new LinkedList<>();
//        lst.add(10.1);
//        lst.add(20.2);
//        lst.add(30.3);
//        lst.add(30.3000001);
//        System.out.println(lst);
//        System.out.println("Size is " + lst.size());
//        for(int i = 0; i < lst.size(); i++){
//            System.out.println("Element " + i + " is " + lst.get(i));
//        }
//        for(Double i : lst){
//            System.out.println("Element " + i);
//        }
//        System.out.println();
        ListIterator<Double> iter = list.listIterator();
        double total = 0;
        while(iter.hasNext()){
            double x = iter.next();
            System.out.print(x + " ");
            total += x;
        }
//        while(iter.hasPrevious()){
//            System.out.print(iter.previous() + " ");
//        }
    }

    public static void main(String[] args) {
        List<Double> list1 = new LinkedList<>();
        List<Double> list2 = new ArrayList<>();
        addNumber(list1);
        addNumber(list2);

    }
}
