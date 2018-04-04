package main.java.io;

import java.io.FileWriter;

/**
 * Created by Darush on 1/16/2018.
 */
public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("files/test.txt");
            String string = "File Writer text";
            writer.write(string);
            writer.close();
            System.out.println("Done...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
