package Week4;

public class PetTester {
    public static void main(String[] args) {
        Pet dog = new Pet("Dog", "Solovino", 1000);
        System.out.println(dog);
        Pet cat = new Pet("Cat", "Fluffy", 1040);
        System.out.println(cat);
        System.out.println(Pet.getNumberOfPets());
//        System.out.println(cat);
//        cat.petThePet(25);
//        System.out.println(cat);
//        cat.sameName("4");
    }
}
