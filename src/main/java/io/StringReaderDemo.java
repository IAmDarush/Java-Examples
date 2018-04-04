package main.java.io;

import java.io.StringReader;

/**
 * Created by Darush on 1/20/2018.
 */
public class StringReaderDemo {
    public static void main(String[] args) {
        try {
            String str = "Hello String Reader Demo!!";
            StringReader reader = new StringReader(str);
            int i;
            while((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
