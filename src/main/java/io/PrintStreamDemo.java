package main.java.io;

import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by Darush on 1/19/2018.
 */
public class PrintStreamDemo {
    public static void main(String[] args) {

        try {
            FileOutputStream fout = new FileOutputStream("files/test.txt");
            PrintStream print = new PrintStream(fout);
            print.println(2016);
            print.println("Hello Java");
            print.println("Welcome to Java");
            print.close();
            fout.close();
            System.out.println("Success...");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
