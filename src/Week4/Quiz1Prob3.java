package Week4;

public class Quiz1Prob3 {

    public static int sumTheRange(int initial, int last){
        int total = 0;
        for (int i = initial; i <= last; i++)total += i;
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sumTheRange(2,4));
        System.out.println(sumTheRange(2,10));
    }
}
