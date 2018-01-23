import java.io.Console;

/**
 * Created by Darush on 1/12/2018.
 */
public class ConsoleDemo {
    public static void main(String[] args){
        Console console = System.console();
        System.out.println("Enter your name:");
        String name = console.readLine();
        System.out.println("Welcome " + name);

        System.out.println("Enter you password:");
        char[] chars = console.readPassword();
        String password = String.valueOf(chars);
        System.out.println("Password is: " + password);
    }
}
