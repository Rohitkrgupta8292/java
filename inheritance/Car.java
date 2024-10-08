// Inheritance concepts.
package inheritance;
class Vehicle {
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Honk");
    }
}

public class Car extends Vehicle {
    private String modelName = "Mustang";
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk(); // Output: Honk
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}