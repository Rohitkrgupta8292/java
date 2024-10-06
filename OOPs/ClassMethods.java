package OOPs;

public class ClassMethods { 
    // fullThrottle public class method.
    public void fullThrottle(){
        System.out.println("Full Throttle ON");
    }
    // speed public class method with parameter.
    public void speed(int maxSpeed){
        System.out.println("Speed is " + maxSpeed);
    }

    // main method
    public static void main(String[] args) {
        ClassMethods obj = new ClassMethods();
        obj.fullThrottle();
        obj.speed(200);
    }
}
