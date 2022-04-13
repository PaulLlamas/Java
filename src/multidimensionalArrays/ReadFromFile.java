package multidimensionalArrays;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
//    public static void main(String[] args) throws IOException {
//        // Try reading from a file
//        File reader = new File("test.txt");
//        Scanner in = new Scanner(reader);
//        String word = "";
//
//        while (in.hasNext()) {
//            word = in.next();
//            System.out.println(word);
//        }
//        in.close();

    public static void main(String[] args) {
        // Try reading from a file
       try{

        File reader = new File("multidimensionalArrays/test.txt");
        Scanner in = new Scanner(reader);
        String word = "";

        while (in.hasNext()) {
            word = in.next();
            System.out.println(word);
        }
        in.close();
    }catch (IOException exception){
           System.out.println("File not found" + exception);
       }
    }
}
