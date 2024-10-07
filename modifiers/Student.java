package modifiers; // package

// abstract class.
abstract class Main {
    public String fname = "Rohit";
    public String lname = "Gupta";
    public int age = 21;
    public abstract void study(); // abstract method.
}

// sub class which will inherited Main class and provide body for abstrct method.
public class Student extends Main {
    public int graduationYear = 2025;
    public void study() { // body of abstract class provide here.
        System.out.println("Studying in Manipal University Jaipur in BCA 5th sem");
    }
}

