package enums;

public class ForEnum {

    enum Level{
        LOW, MEDIUM, HIGH
    }
    public static void main(String[] args) { 
        for(Level level : Level.values()){
            System.out.println(level);
        }
    }
}
