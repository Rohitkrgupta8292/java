package innerClass;

class OuterClass {
    int x = 10;
    // Inner class
    class InnerClass {
        int y = 5;
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        System.out.println(inner.y + outer.x); // Output: 15
    }
}
