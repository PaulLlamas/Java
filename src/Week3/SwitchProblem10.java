package Week3;
import java.util.Scanner;
public class SwitchProblem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter letter grade: ");
        String letterGrade = input.next();
        int gradeValue = 0;
        switch(letterGrade) {
            case "A":
                System.out.println("4");
                gradeValue = 4;
                break;
            case "B":
                System.out.println("3");
                gradeValue = 3;
                break;
            case "C":
                System.out.println("2");
                gradeValue = 2;
                break;
            case "D":
                System.out.println("1");
                gradeValue = 1;
                break;
            case "F":
                System.out.println("0");
                gradeValue = 0;
                break;
            default:
                System.out.println("Invalid input. Try again.");
        }
    }
}
