package fileHandling;
import java.io.File;

public class Delete {
    public static void main(String[] args) {
        File myFile = new File("filename.txt");
        if(myFile.delete()){
            System.out.println("File deleted: " + myFile.getName());
        } else {
            System.out.println("File not deleted");
        }
    }
}
