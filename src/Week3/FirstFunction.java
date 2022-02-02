package Week3;

public class FirstFunction {

    public static String singFullSong(String name) {
        String out = "Happy birthday to you, Happy birthday to you. ";
        out += "Happy birthday dear " + name + "!";
        out += " Happy birthday to you!";
        return out;
    }

    public static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday " + name + "! You are now " + age + " years old!");
        System.out.println(singFullSong(name));
    }

    public static void main(String[] args) {
        System.out.println("Starting Main");
        happyBirthday("Suzy", 18);
        System.out.println("Back in Main.");
    }
}
