// using comparable in class car for sorting it in year wise
package advancedSorting;
// import ArrayList, Collections class
import java.util.ArrayList;
import java.util.Collections;

// create Car Class to implements Comparable
class Car implements Comparable<Car> {
    public String brand;
    public String model;
    public int year;

    public Car(String b, String m, int y){
        brand = b;
        model = m;
        year = y;
    }

    public int compareTo(Car obj){
        return year - obj.year;
    }
}
public class Comparable1 {
    public static void main(String[] args) {
        // create an ArrayList of Car objects
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2015));
        cars.add(new Car("Honda", "Civic", 2017));
        cars.add(new Car("Ford", "Mustang", 2016));
        cars.add(new Car("Toyota", "Corolla", 2018));
        cars.add(new Car("Honda", "Accord", 2019));
        cars.add(new Car("Ford", "Fusion", 2014));
        // sort the ArrayList using Collections.sort()
        Collections.sort(cars);
        // print the sorted ArrayList
        for (Car car : cars) {
            System.out.println(car.brand + " " + car.model + " " + car.year);
        }
    }
}
