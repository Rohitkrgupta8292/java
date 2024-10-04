package array;

public class Array_avg {
    public static void main(String[] args) { 
        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};
        float avg;
        int sum = 0;
        int length_array = ages.length;
        for(int age : ages){
            sum += age;
        }
        avg = (float)sum / length_array;
        System.out.println("Average of the array is: " + avg);
    }
}
