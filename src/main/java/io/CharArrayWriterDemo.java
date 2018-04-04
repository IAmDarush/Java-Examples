package main.java.io;

import java.io.CharArrayWriter;
import java.io.FileWriter;

/**
 * Created by Darush on 1/17/2018.
 */
public class CharArrayWriterDemo {
    public static void main(String[] args) {
        try {
            CharArrayWriter writer = new CharArrayWriter();
            writer.write("CharArrayWriter example");

            FileWriter fw1 = new FileWriter("files/a.txt");
            FileWriter fw2 = new FileWriter("files/b.txt");
            FileWriter fw3 = new FileWriter("files/c.txt");
            FileWriter fw4 = new FileWriter("files/d.txt");

            writer.writeTo(fw1);
            writer.writeTo(fw2);
            writer.writeTo(fw3);
            writer.writeTo(fw4);

            fw1.close();
            fw2.close();
            fw3.close();
            fw4.close();
            System.out.println("Success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
