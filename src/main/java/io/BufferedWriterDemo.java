package main.java.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * Created by Darush on 1/16/2018.
 */
public class BufferedWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("files/test.txt");
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.write("Buffered Writer Demo.");
            buffer.close();
            System.out.println("Done...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
