package userInputs;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner myObj  = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = myObj.nextLine(); // prompting name from user.
        System.out.print("Enter your age:");
        int age = myObj.nextInt(); // prompting age from user.
        System.out.print("Enter your salary:");
        Float salary = myObj.nextFloat(); // prompting salary from user.
        myObj.close();
        // displaying the user given outputs
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}