package innerClass;

class OuterClass {
    int x = 10;
    // inner class for accessing the value of x in inner classs
    class InnerClass {
        public int myInnerMethod(){
            return x;
        }
    }
}

public class Inner {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        System.out.println(inner.myInnerMethod());
    }
}
