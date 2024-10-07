package encapsulation;

public class Person {
    private String name; // private restricted access.
    private int age;
    // Getter for Name.
    public String getName() {
        return name;
    }
    // Getter for Age.
    public int getAge() {
        return age;
    }
    // Setter for Name.
    public void setName(String newName) {
        this.name = newName;
    }
    //Setter for Age.
    public void setAge(int newAge) {
        if (newAge >= 0 && newAge <= 100) {
            this.age = newAge;
        }
        else {
            System.out.println("Invalid age");
        }
    }
}
