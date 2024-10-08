package innerClass;

class OuterClass {
    int x = 10;
    // static Inner class
    static class InnerClass {
        int y = 5;
    }
}


public class Static {
    public static void main(String[] args) {
        OuterClass.InnerClass inner = new OuterClass.InnerClass();
        System.out.println(inner.y);
    }
}
