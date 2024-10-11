package enums;

public class BasicEnum {
    enum Level {   // creating an enum class.
        LOW,
        MEDIUM,
        HIGH
    }
    public static void main(String[] args) {
        Level level = Level.MEDIUM;
        System.out.println(level);  // prints MEDIUM
    }
}