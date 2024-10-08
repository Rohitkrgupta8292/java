package java_interface;
// Multiple interface in Java similar like multiple inheritence in java.
interface FirstInterface { // first interface
    public void myMethod();
}
interface SecondInterface{ // second interface
    public void myMethod2();
}

class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() { // body of mymethod
        System.out.println("This is myMethod");
    }
    public void myMethod2() { // body of mymethod2
        System.out.println("This is myMethod2");
    }
}

public class Multiple {
    public static void main(String[] args) {
        DemoClass obj = new DemoClass();
        obj.myMethod();
        obj.myMethod2();
    }
}