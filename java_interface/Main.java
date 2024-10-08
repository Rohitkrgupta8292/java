package java_interface;
// interface in java
interface Animal {
    public void animalSound();
    public void sleep();
}

class Pig implements Animal {
    public void animalSound() {
        System.out.println("The pig says: Oink");
    }
    public void sleep(){
        System.out.println("The pig is sleeping");
    }
}

public class Main {
    public static void main(String[] args) {
        Pig myObj = new Pig();
        myObj.animalSound();
        myObj.sleep();
    }
}