package demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class app {

    public static void main(String[] args) {
        File file = new File("test2.txt");

        try {
            FileReader fr = new FileReader(file);
            
            // Bir istisna atýlýrsa bu yürütülmez
            System.out.println("Continuing ....");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        }

        System.out.println("Finished.");
    }

}
