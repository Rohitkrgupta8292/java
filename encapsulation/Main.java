package encapsulation;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the class
        Person person = new Person();
        person.setName("John");
        person.setAge(21);
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}