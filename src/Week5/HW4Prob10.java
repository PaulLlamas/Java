package Week5;

public class HW4Prob10 {

    public static double percentOf(int withPer, double number){
        return (withPer / 100.0 * number);
    }

    public static double findPercent(double first, double second){
        double output = first / second * 100;
        return output;
    }

    public static void main(String[] args) {
        System.out.println(HW4Prob10.percentOf(50, 132.0));
        System.out.println(HW4Prob10.findPercent(30.0, 150.0));
    }
}
