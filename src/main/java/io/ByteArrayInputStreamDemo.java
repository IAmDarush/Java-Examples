package main.java.io;

import java.io.ByteArrayInputStream;

/**
 * Created by Darush on 1/8/2018.
 */
public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        byte[] buf = {35, 36, 37, 38};
        // Create the new byte array input stream
        ByteArrayInputStream bin = new ByteArrayInputStream(buf);
        int i = 0;
        while ((i=bin.read()) != -1) {
            char ch = (char) i;
            System.out.println("ASCII value of Character is: " + i + "; Special character is: " + ch);

        }
    }
}
