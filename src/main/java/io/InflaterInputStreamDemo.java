package main.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

/**
 * Created by Darush on 1/25/2018.
 */
public class InflaterInputStreamDemo {

    public static void main(String[] args) {

        try {
            FileInputStream input = new FileInputStream("files/DeflaterOutputStreamDemo.txt");
            FileOutputStream output = new FileOutputStream("files/DeflaterOutputStreamDemo.java");
            InflaterInputStream inflater = new InflaterInputStream(input);

            int i;
            while ((i = inflater.read()) != -1) {
                output.write((byte) i);
            }

            inflater.close();
            output.close();
            System.out.println("Successfully decompressed the file...");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
