package arrayList; // basic method of ArrayList in java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        // add() method.
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Honda");
        System.out.println(cars);
        // get() method
        System.out.println(cars.get(0)); // prints Volvo
        // set() method
        cars.set(0, "Toyota");
        System.out.println(cars);
        //remove() method
        cars.remove(0);
        System.out.println(cars);
        // size() method.
        System.out.println(cars.size());
        // clear() method
        cars.clear();
        System.out.println(cars);
    }
}
