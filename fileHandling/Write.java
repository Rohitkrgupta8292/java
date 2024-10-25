package fileHandling;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {
        try {
            // Specify the file path and name
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Hello, World!");
            myWriter.close();
            System.out.println("Successfully wrote in the filename.txt");
        } catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
