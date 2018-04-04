package main.java.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;

/**
 * Created by Darush on 1/20/2018.
 */
public class StringWriterDemo {

    public static void main(String[] args) {
        try {
            char[] chars = new char[512];
            StringWriter writer = new StringWriter();
            FileInputStream input = new FileInputStream("files/test.txt");
            BufferedReader buffer = new BufferedReader(new InputStreamReader(input,"UTF-8"));
            int i;

            while((i = buffer.read(chars)) != -1) {
                writer.write(chars, 0, i);
            }

            System.out.println(writer.toString());
            writer.close();
            buffer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
