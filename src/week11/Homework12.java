package week11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Homework12 {
    public static void main(String[] args) {
        Map<HashMap<Integer, String>, String > test = new HashMap<HashMap<Integer, String>, String>();
        HashMap<Integer, String> inside1 = new HashMap<Integer, String>();
        inside1.put(1, "Hey");

        HashMap<Integer, String> inside2 = new HashMap<Integer, String>();
        inside2.put(1, "Yeg");

        HashMap<Integer, String> inside3 = new HashMap<Integer, String>();
        inside3.put(1, "Hoy");

        test.put(inside1, "Hello");
        test.put(inside2, "World");
        test.put(inside3, "!");

        System.out.println(test);

        test.put(inside1, "How");
        test.put(inside2, "Wow");
        test.put(inside3, "Meow");

        System.out.println(test);

        System.out.println(test.get(inside1));
        System.out.println(test.get(inside2));
        System.out.println(test.get(inside3));

        test.remove(inside2);

        System.out.println(test);

//        Set<String> keySet = test.keySet();
//        for (String key : keySet) {
//            System.out.println("key is " + key + " value is " + test.get(key));
//        }
    }

}
