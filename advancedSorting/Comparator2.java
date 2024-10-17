// import ArrayList, collections
package advancedSorting;
import java.util.Collections;
import java.util.ArrayList;

public class Comparator2 {
    public static void main(String[] args) {
        // Create an ArrayList of Integer
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(35);
        nums.add(2);
        nums.add(15);
        nums.add(7);
        nums.add(8);

        // sorting with comparator using  Lambda expression 
        Collections.sort(nums, (obj1,obj2) -> {
            // even first then odd
            Integer a = (Integer) obj1;
            Integer b = (Integer) obj2;

            boolean aIsEven = (a % 2) == 0;
            boolean bIsEven = (b % 2) == 0;
            if (aIsEven == bIsEven) {
                return a-b;
            } else{
                return aIsEven ? -1 : 1;
            }
        });

        // print values
        for(int i : nums){
            System.out.println(i);
        }
    }
}
