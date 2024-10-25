package fileHandling;
import java.io.File;

public class GetInfo {
    public static void main(String[] args) {
        File myFile = new File("filename.txt");
        if(myFile.exists()){
            System.out.println("File name:" + myFile.getName());
            System.out.println("File path:" + myFile.getAbsolutePath());
            System.out.println("File writable:" + myFile.canWrite());
            System.out.println("File readable:" + myFile.canRead());
            System.out.println("File size in bytes:" + myFile.length());
        } else {
            System.out.println("File does not exist");
        }
    }
}
