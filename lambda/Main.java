package lambda;
// Using lambda expression in ArrayList to print all numbers using forEach method.
import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        Consumer<Integer> method = ((n) -> {System.out.println(n); } ); // to store the lambda expression in consumer.
        numbers.forEach(method);
    }
}