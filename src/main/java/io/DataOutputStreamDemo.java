package main.java.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * Created by Darush on 1/9/2018.
 */
public class DataOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("files/doutTest.txt");
            DataOutputStream dout = new DataOutputStream(fout);
            dout.writeInt(65);
            dout.flush();
            dout.close();
            fout.close();
            System.out.println("Success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
