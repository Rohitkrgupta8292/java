// using comparator for advanced sorting in Class Car by using launch year of car to sort it in ascending order
package advancedSorting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// creating Car class 
class Car {
    public String brand;
    public String model;
    public int year;

    public Car(String b, String m, int y){
        brand = b;
        model = m;
        year = y;
    }
}

// Comparator implements by SortByYear Class
class SortByYear implements Comparator<Car> {
    public int compare(Car a, Car b) {
        // Car a = (Car) obj1;
        // Car b = (Car) obj2;

        if (a.year < b.year) return -1;
        if (a.year > b.year) return 1;
        return 0;
    }
}
public class Comparator1 {
    public static void main(String[] args) {
        // creating ArrayList of Car objects
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car("Toyota", "Camry", 2015));
        cars.add(new Car("Honda", "Civic", 2012));
        cars.add(new Car("Ford", "Mustang", 1969));
        cars.add(new Car("BMW", "X5", 2006));
        cars.add(new Car("Audi", "A4", 2018));

        // create Comparator object
        Comparator<Car> sortByYear = new SortByYear();
        // sort
        Collections.sort(cars, sortByYear);
        // print all values;
        for (Car car : cars) {
            System.out.println(car.brand + " " + car.model + " " + car.year);
        }
    }
}
