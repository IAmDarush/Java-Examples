package main.java.io.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

/**
 * Created by Darush on 1/25/2018.
 */
public class DeflaterOutputStreamDemo {

    public static void main(String[] args) {

        try {
            FileInputStream input = new FileInputStream("DeflaterOutputStreamDemo.java");
            FileOutputStream output = new FileOutputStream("files/DeflaterOutputStreamDemo.txt");
            DeflaterOutputStream deflater = new DeflaterOutputStream(output);

            int i;
            while((i = input.read()) != -1 ) {
                deflater.write((byte) i);
                deflater.flush();
            }

            input.close();
            deflater.close();
            System.out.println("Done...");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}


