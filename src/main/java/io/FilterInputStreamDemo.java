package main.java.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;

/**
 * Created by Darush on 1/10/2018.
 */
public class FilterInputStreamDemo {
    public static void main(String[] args) {
        try {
            File file = new File("files/test.txt");
            FileInputStream fileInput = new FileInputStream(file);
            FilterInputStream filterInput = new BufferedInputStream(fileInput);
            int k = 0;
            while ((k = filterInput.read()) != -1) {
                System.out.print((char) k);
            }
            filterInput.close();
            fileInput.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
