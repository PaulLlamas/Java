package Week4;

public class Pet {
    // Attributes
    private String type;
    private String name;
    private int petting_times;
    // Constructor
    public Pet(String type, String name, int petting_times) {
        this.type = type;
        this.name = name;
        this.petting_times = petting_times;
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

    // Print method
    public  String toString() {
        String out_print = name + " is a " + type + " who has been petted " + petting_times + " times";
        return out_print;
    }
}
