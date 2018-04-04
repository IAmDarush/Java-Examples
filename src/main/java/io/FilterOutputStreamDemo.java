package main.java.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

/**
 * Created by Darush on 1/10/2018.
 */
public class FilterOutputStreamDemo {
    public static void main(String[] args) {
        try {
            File file = new File("files/test.txt");
            FileOutputStream fileOut = new FileOutputStream(file);
            FilterOutputStream filterOut = new FilterOutputStream(fileOut);
            String s = "Hello World!";
            byte[] bytes = s.getBytes();
            filterOut.write(bytes);
            filterOut.flush();
            filterOut.close();
            fileOut.close();
            System.out.println("Success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
