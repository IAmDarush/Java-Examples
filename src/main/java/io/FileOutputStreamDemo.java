package main.java.io;

import java.io.FileOutputStream;

/**
 * Created by Darush on 1/5/2018.
 */
public class FileOutputStreamDemo {

    public static void main(String[] args) {
        try {

            // Write a byte
            FileOutputStream fileOutputStream = new FileOutputStream("files/test.txt");
            fileOutputStream.write(65); // letter A
            fileOutputStream.close();
            System.out.println("Byte written successfully...");

            // Write a string
            fileOutputStream = new FileOutputStream("files/string.txt");
            String s = "Hello World!";
            byte[] bytes = s.getBytes();
            fileOutputStream.write(bytes);
            fileOutputStream.close();
            System.out.println("String written successfully...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}


