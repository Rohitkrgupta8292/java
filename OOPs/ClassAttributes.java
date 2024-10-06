package OOPs;

public class ClassAttributes {
    // Multiple Attributes or fields in classes.
    String fname = "Rohit"; 
    String lname = "Gupta";
    int age = 21;
    public static void main(String[] args) {
        ClassAttributes obj = new ClassAttributes();
        System.out.println("Name: " + obj.fname + " " +  obj.lname);
        System.out.println("Age: " + obj.age);
        // assigning new values to Class Attributes.
        obj.fname = "Sagar";
        obj.lname = "sharma";
        obj.age = 17;
        System.out.println("Name: " + obj.fname + " " +  obj.lname);
        System.out.println("Age: " + obj.age);
    }
}
