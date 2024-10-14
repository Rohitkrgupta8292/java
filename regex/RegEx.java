package regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegEx {
    public static void main(String[] args) {
        String str = "Hello, World! 123";
        Pattern pattern = Pattern.compile("hello", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        boolean matchFound = matcher.find();
        if(matchFound){
            System.out.println("Match found");
        } else {
            System.out.println("No match found");
        }
    }
}