package fileHandling;
import java.io.File;

public class DeleteFolder {
    public static void main(String[] args) {
        File myFile = new File("C:\\Users\\rohit\\Downloads\\GitHub\\Java\\fileHandling\\text");
        if (myFile.delete()) {
            System.out.println("Folder deleted: "+ myFile.getName());
        } else {
            System.out.println("Folder not deleted");
        }
    }
}
