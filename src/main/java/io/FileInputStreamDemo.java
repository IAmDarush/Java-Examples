package main.java.io;

import java.io.FileInputStream;

/**
 * Created by Darush on 1/5/2018.
 */
public class FileInputStreamDemo {
    public static void main(String[] args) {
        try {
            // Read a single character
            FileInputStream fileInputStream = new FileInputStream("files/test.txt");
            int i = fileInputStream.read();
            System.out.println((char) i);
            fileInputStream.close();

            // Read all characters
            fileInputStream = new FileInputStream("files/string.txt");
            while((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
            fileInputStream.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
