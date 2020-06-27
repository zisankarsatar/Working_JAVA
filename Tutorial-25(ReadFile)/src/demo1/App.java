package demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class App {

    public static void main(String[] args) throws FileNotFoundException {
        
        File file = new File("test.txt");
        
        //FileReader fr = new FileReader(file);
        
        Scanner in = new Scanner(file);
        
        int value = in.nextInt();
        System.out.println("Read value: " + value);
        
        in.nextLine();
        
        int count = 2;
        while(in.hasNextLine()) {
            String line = in.nextLine();
            
            System.out.println(count + ": " + line);
            count++;
        }
        
        in.close();
        
    }

}
