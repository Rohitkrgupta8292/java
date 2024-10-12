package hashSet;
// creating an HashSet object of numbers.
import java.util.HashSet; // importing HashSet class from util package.
public class Main {
    public static void main(String[] args) {
        // Creating an HashSet object of numbers.
        HashSet<Integer> numbers = new HashSet<Integer>();
        // Adding elements to the HashSet object.
        numbers.add(1);
        numbers.add(4);
        numbers.add(5);
        numbers.add(9);
        // run loop from i to 10 and check in numbers hashset that number contains or not.
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " is present in the HashSet");
            } else {
                System.out.println(i + " is not present in the HashSet");
            }
        }
    }
}
