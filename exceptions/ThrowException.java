package exceptions;

public class ThrowException {
    static void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("Age is less than 18");
        } else {
            System.out.println("Age is greater than or equal to 18");
        }
    }
    public static void main(String[] args) {
        checkAge(19);
    }
    
}
