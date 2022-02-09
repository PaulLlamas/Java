package Week5;

import java.util.ArrayList;

public class TryArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        ArrayList<String> strList = new ArrayList<>();
        System.out.println(strList);
        strList.add("Hello");
        strList.add("how");
        strList.add("is");
        strList.add("everything");
        strList.add("going?");
        System.out.println(strList);
        strList.add(1, "Bye");
        System.out.println(strList);
//        strList.remove("Bye");
//        System.out.println(strList);
        System.out.println(strList.contains("Bye"));
    }
}
