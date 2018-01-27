import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public static void main(String[] args) {

        String regex = ".s"; // pattern indicates that the 2nd character should be s
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
        System.out.println(Pattern.matches(regex, "ab")); // false, second character is not s

        System.out.println("--------Regex Character Classes--------");
        System.out.println(Pattern.matches("[abc]", "def")); // false, not a or b or c
        System.out.println(Pattern.matches("[abc]", "a")); // true, a is there

        System.out.println("--------Regex Quantifiers--------");
        System.out.println(Pattern.matches("[abc]?", "a"));// true, a comes one time or not at all
        System.out.println(Pattern.matches("[abc]?", "aaa"));// false, a comes more than one time
        System.out.println(Pattern.matches("[abc]+", "aaa"));// true, a comes one or more times
        System.out.println(Pattern.matches("[abc]+", "aax"));// false, x is not matching
        System.out.println(Pattern.matches("[abc]*", "aabbc"));// true, a or b or c come zero or more times
        System.out.println(Pattern.matches("[abc]{3}", "aab"));// true, a or b or c come exactly 3 times

        System.out.println("--------Regex Metacharacters--------");
        System.out.println(Pattern.matches("\\d", "a"));// false, non-digit
        System.out.println(Pattern.matches("\\d", "1"));// true, digit and comes once
        System.out.println(Pattern.matches("\\d", "1"));// false, digit but comes more than once
        System.out.println(Pattern.matches("\\d", "1asd"));// false, digit and char

        System.out.println(Pattern.matches("\\D", "a"));// true, non-digit
        System.out.println(Pattern.matches("\\D", "1"));// false, digit
        System.out.println(Pattern.matches("\\D*", "asdf"));// true, zero or more non-digits

    }

}
