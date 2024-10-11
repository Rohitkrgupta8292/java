package arrayList;
// creating an arrayList of Intergers and using forloop, foreach loop and sorting.
import java.util.ArrayList;
import java.util.Collections;

public class LoopSortNums {
    public static void main(String[] args) {
        // Creating an ArrayList of Integers
        ArrayList<Integer> numbers = new ArrayList<Integer>(); // object of arrayList
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        numbers.add(15);
        numbers.add(20);
        // Using for Loop print all values
        System.out.println("Using For loop before sorting");
        for(int i=0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
        System.out.println("------------------------------");
        // using for each loop to print all values
        System.out.println("Using For Each Loop before sorting");
        for (Integer num : numbers) {
            System.out.println(num);
        }
        System.out.println("------------------------------");

        // sorting arraylist then print all values using for each loop.
        Collections.sort(numbers);
        System.out.println("Using For Each Loop after sorting");
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}
