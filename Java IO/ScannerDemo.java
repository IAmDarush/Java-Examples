import java.util.Scanner;

/**
 * Created by Darush on 1/24/2018.
 */
public class ScannerDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.next();
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println(name + "'s age is " + age);

        scanner.close();
    }

}
