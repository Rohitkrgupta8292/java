package abstraction;

//abstract class
abstract class Animal {
    public abstract void animalSound(); // abstract method.
    public void sleep(){  // regular method.
        System.out.println("Zzz");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: Oink"); // abstract method body provided here.
    }
}

public class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // create an object of Pig class.
        myPig.animalSound(); // call the  abstract method
        myPig.sleep(); // call the method
    }
}
