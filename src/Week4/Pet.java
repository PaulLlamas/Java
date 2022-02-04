package Week4;

public class Pet {
    // Attributes
    private String type;
    private String name;
    private int petting_times;
    private static int numberOfPets = 0;

    // Constructor
    public Pet(String type, String name, int petting_times) {
        this.type = type;
        this.name = name;
        this.petting_times = petting_times;
        numberOfPets += 1;
    }
    // Other methods
    public void petThePet (int times){
        petting_times += times;
    }
    public void sameName(int x) {
        System.out.println("The integer is " + x);
    }
    public void sameName(String x) {
        System.out.println("This is a String " + x);
    }
    public static int getNumberOfPets(){
        return numberOfPets;
    }

    // Print method
    public  String toString() {
        String out_print = name + " is a " + type + " who has been petted " + petting_times + " times";
        return out_print;
    }
}
