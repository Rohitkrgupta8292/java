package exceptions;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int[] myArray = { 1, 2, 3 };
            System.out.println(myArray[1]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (Exception e) {
            System.out.println("Caught an exception");
        } finally {
            System.out.println("This will always be printed");
        }
    }

}
