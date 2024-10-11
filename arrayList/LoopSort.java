package arrayList;
// creating arrayList of string and using forloop, foreach loop and sorting.
import java.util.ArrayList;
import java.util.Collections;

public class LoopSort {
    public static void main(String[] args) {
        // Creating an ArrayList with String
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Toyota");
        cars.add("Honda");
        // using for loop to print all item of cars
        System.out.println("Using For Loop before sorting");
        for(int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }
        System.out.println("-------------------------------");
        // using foreach loop to print all item of cars
        System.out.println("Using Foreach Loop before sorting");
        for(String car : cars){
            System.out.println(car);
        }
        System.out.println("-------------------------------");

        // Using sorting and then printing using for-each loop.
        Collections.sort(cars);
        System.out.println("Using loop after sorting");
        for(String car: cars){
            System.out.println(car);
        }
    }
}
