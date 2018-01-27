import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public static void main(String[] args) {

        String regex = ".s"; // matches a s character
        String input = "as";

        // First way
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        boolean result1 = matcher.matches();

        // Second way
        boolean result2 = Pattern.compile(regex).matcher(input).matches();

        // Third way
        boolean result3 = Pattern.matches(regex, input);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);


    }

}
