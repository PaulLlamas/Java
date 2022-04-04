package GenericSampleCode;

/**
 * Created by Owner on 4/17/2017.
 */

public class OurUtils {

   public static void printStrings(String[] array) {
       for (String item : array)
           System.out.print (item + " ");
       System.out.println();
   }

    public static <E> void print(E[] array) {
        for (E item : array)
            System.out.print (item + " ");
        System.out.println();
    }

    //Remember how to find the minimum
    public static double minDouble(Double[] array) {
       double minimum = array[0];
       for(int i = 1; i < array.length; i++){
           if(minimum > array[i]) minimum = array[i];
       }
       return minimum;
    }

    public static <E extends Comparable<E>> E min(E[] array) {
       E smallest = array[0];
       for (int index = 1; index < array.length; index++)
           if (array[index].compareTo(smallest) < 0)
               smallest = array[index];
       return smallest;
    }
    //after erasure
    public static Comparable min2(Comparable[] array) {
       Comparable smallest = array[0];
       for (int index = 1; index < array.length; index++)
           if (array[index].compareTo(smallest) < 0)
               smallest = array[index];

       return smallest;
    }
}
