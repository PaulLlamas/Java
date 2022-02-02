import java.util.Scanner;
public class keyboard {
    public static void main(String[] args) {
//        Scanner input = new Scanner (System.in);
//        System.out.println("Input the diameter: ");
//        int diameter = input.nextInt();
//        int radius = diameter / 2;
//        Scanner input2 = new Scanner (System.in);
//        System.out.println("Input the number of slices: ");
//        int slices = input2.nextInt();
//        double area_slice = (Math.PI * (Math.pow(radius, 2))) / slices;
//        System.out.println("The area of a slice of pizza is: " + area_slice);
//        input.close();
//        input2.close();
        Scanner input = new Scanner (System.in);
        System.out.println("Input first integer: ");
        int int1 = input.nextInt();
        System.out.println("Input second integer: ");
        int int2 = input.nextInt();
        System.out.println("Input third integer: ");
        int int3 = input.nextInt();

        if (int1 > int2 && int2 > int3) {
            System.out.println("Decreasing");
        } else if (int3 > int2 && int2 > int1) {
            System.out.println("Increasing");
        } else if (int1 == int2 && int2 == int3) {
            System.out.println("Equal");
        } else System.out.println("False");
    }
}
