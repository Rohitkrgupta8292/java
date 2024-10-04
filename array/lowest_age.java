package array;

public class lowest_age {   
    public static void main(String[] args) {
        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};
        int lowest_age = ages[0];
        for(int age : ages){
            if(age < lowest_age) {
                lowest_age = age;
            }
        }
        System.out.println("The lowest age is: " + lowest_age);
    }
}
