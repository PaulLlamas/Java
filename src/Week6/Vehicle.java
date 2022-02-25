package Week6;

public class Vehicle {
    private int numberOfWheels;
    private String vehicleType;
    private String color;
    private String owner;

    public Vehicle(int numberOfWheels, String vehicleType, String color, String owner){
        this.numberOfWheels = numberOfWheels;
        this.vehicleType = vehicleType;
        this.color = color;
        this.owner = owner;
    }

    public void newOwner(String newOwner){
        owner = newOwner;
    }

    public String toString(){
         String out = "The owner of the " + color + " " + vehicleType + " is " + owner + " and has ";
                out += + numberOfWheels + " wheels.";
    return out;
    }

    public static void main(String[] args) {
        Vehicle truck = new Vehicle(4, "truck", "black", "Paul");
        System.out.println(truck);
        truck.newOwner("Bob");
        System.out.println(truck);
    }
}
