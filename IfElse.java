public class IfElse {
    public static void main(String[] args) {
        int time = 20;
        // simple if statement.
        if(20>18){
            System.out.println("20 is greater than 18");
        }
        
       // if-else statement.
       if(time<18){
        System.out.println("Good Day");
       } else {
        System.out.println("Good Evening");
       }

       // if-else-if statement.
       if(time<10){
        System.out.println("Good morning");
       } else if(time < 18) {
        System.out.println("Good afternoon");
       } else {
        System.out.println("Good Evening");
       }

       // Short hand if-else also known as ternary operator.
       String greeting = (time<18) ? "Good Day" : "Good Evening";
       System.out.println(greeting);
    }
}
