package week8;

public class Homework8_155 {
    public static int recursiveFactorial(int number){
        if (number == 0) return 0;
        else if (number == 1){
            return 1;
        }else{
        return number + recursiveFactorial(number - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(recursiveFactorial(4));
    }
}
