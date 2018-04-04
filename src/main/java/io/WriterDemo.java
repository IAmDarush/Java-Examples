package main.java.io;

import java.io.FileWriter;
import java.io.Writer;

/**
 * Created by Darush on 1/15/2018.
 */
public class WriterDemo {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("files/test.txt");
            String string = "I love my country";
            writer.write(string);
            writer.append(".");
            writer.append(" How about you?");
            writer.close();
            System.out.println("Done...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
