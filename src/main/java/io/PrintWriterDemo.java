package main.java.io;

import java.io.File;
import java.io.PrintWriter;

/**
 * Created by Darush on 1/19/2018.
 */
public class PrintWriterDemo {
    public static void main(String[] args){
        try {
            PrintWriter writer = new PrintWriter(System.out);
            writer.write("Hello Print Writer!");
            writer.close();

            PrintWriter writer1 = null;
            writer1 = new PrintWriter(new File("files/test.txt"));
            writer1.write("This is the second Printer Writer");
            writer1.flush();
            writer1.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
