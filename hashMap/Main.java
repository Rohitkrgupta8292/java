package hashMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // create a hashmap for people name and age.
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("John", 25);
        people.put("Alice", 30);
        people.put("Rohit", 21);

        for (String i : people.keySet()) { // for each loop to print item of hashmap
            System.out.println("Key:" + i + " value:" + people.get(i));
        }
    }
}
