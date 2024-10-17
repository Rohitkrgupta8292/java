package lambda;
// create an interface to store lambda expression.
interface StringFunction {
    String run(String str);
}

public class Main2 {    
    public static void main(String[] args) {
        // create an instance of StringFunction interface which will add an exclaimation mark and Quetions mark at the end of string.
        StringFunction exclaim = (str) -> str + "!";
        StringFunction ask = (str) -> str + "?";
        // call the run method of StringFunction interface with a string parameter.
        printFormatted("Hello", exclaim);
        printFormatted("hello", ask);
    }
    static void printFormatted(String str, StringFunction format){
        System.out.println(format.run(str));
    }
}
