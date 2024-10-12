package iterator;
// importing Iterator and using in while loop to find the number in ArrayList that is less than 10;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // create an object of number for arrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        // Creating Iterator and using iterator method on numbers
        Iterator<Integer> it = numbers.iterator();
        // using while loop to loop on iterator
        while (it.hasNext()) {
            Integer i = it.next();
            if(i<10){
                it.remove();
            }
        }
        // printing the output of above iteration.
        System.out.println(numbers);
    }    
}
