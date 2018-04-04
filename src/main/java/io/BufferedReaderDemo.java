package main.java.io;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by Darush on 1/16/2018.
 */
public class BufferedReaderDemo {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("files/test.txt");
            BufferedReader buffer = new BufferedReader(reader);
            System.out.println("Is input stream ready to read? " + buffer.ready());
            System.out.println("Does input stream support mark and reset? " + buffer.markSupported());
            char firstChar = (char) buffer.read();
            long numOfCharsSkipped = buffer.skip(1); // Skip one character
            char thirdChar = (char) buffer.read();

            String firstLine = buffer.readLine();
            buffer.mark(90);
            //String secondLine = buffer.readLine();
            //String thirdLine = buffer.readLine();

            System.out.println(firstChar);
            System.out.println(thirdChar);
            System.out.println(firstLine);

            buffer.close();
            reader.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
