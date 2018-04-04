package main.java.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFinderDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter regex pattern:");

            Pattern pattern = Pattern.compile(scanner.nextLine());

            System.out.println("Enter text: ");

            Matcher matcher = pattern.matcher(scanner.nextLine());

            boolean found = false;

            while (matcher.find()) {
                System.out.println("Found the text > " + matcher.group()
                        + " starting at index " + matcher.start()
                        + " and ending at index " + matcher.end()
                );
                found = true;
            }

            if(!found) {
                System.out.println("No matches found!!!");
            }

            System.out.println("Do you want to continue? y/n: ");

            if(scanner.next().equals("n")){
                break;
            }

        }

    }

}
