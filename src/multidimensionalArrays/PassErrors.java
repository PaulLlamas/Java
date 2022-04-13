package multidimensionalArrays;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PassErrors {
    public static void readFile(String filename) throws IOException{
            File reader = new File(filename);
            Scanner in = new Scanner(reader);
            String word = "";

            while (in.hasNext()) {
                word = in.next();
                System.out.println(word);
            }
            in.close();
    }

    public static void main(String[] args) {
        try{
        readFile("test1.txt");
    }catch (IOException exception){
            System.out.println("File not found " + exception);
        }
    }
}
