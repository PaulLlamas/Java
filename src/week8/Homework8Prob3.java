package week8;

public class Homework8Prob3 {
    public static String reverseString(String string){
        if(string.length() <= 1) return string;
        else {
         String first = string.substring(0, 1);
         String last = string.substring(string.length() - 1);
         String middle = string.substring(1,string.length() - 1);
            System.out.println(last + middle + first);
         return last + reverseString(middle) + first;
        }
    }
    public static void main(String[] args) {
        System.out.println(reverseString("parangaricutirimicuaro"));
    }
}