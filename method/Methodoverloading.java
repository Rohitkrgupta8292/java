package method;

public class Methodoverloading {

    static int plusMethod(int x, int y){
        return x + y;
    }
    static double plusMethod(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.5, 5.2);
        System.out.println("Sum of two integers: " + myNum1);
        System.out.println("Sum of two double: " + myNum2);
    }
}
