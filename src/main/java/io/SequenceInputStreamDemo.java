package main.java.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Darush on 1/7/2018.
 */
public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        try {
            // Read from two files and write into third file
            FileInputStream fin1 = new FileInputStream("files/string.txt");
            FileInputStream fin2 = new FileInputStream("files/bouttest.txt");
            FileOutputStream fout = new FileOutputStream("files/sequence.txt");
            SequenceInputStream sequenceInputStream = new SequenceInputStream(fin1, fin2);
            int j;
            while ((j = sequenceInputStream.read()) != -1) {
                fout.write(j);
                System.out.print((char) j);
            }
            sequenceInputStream.close();
            fin1.close();
            fin2.close();


            // Read data using enumeration
            System.out.println("\n>>>>>>>>>>>>Read using enumeration:<<<<<<<<<<<");
            FileInputStream input1 = new FileInputStream("files/a.txt");
            FileInputStream input2 = new FileInputStream("files/b.txt");
            FileInputStream input3 = new FileInputStream("files/c.txt");
            FileInputStream input4 = new FileInputStream("files/d.txt");
            Vector<FileInputStream> vector = new Vector<>();
            vector.add(input1);
            vector.add(input2);
            vector.add(input3);
            vector.add(input4);
            Enumeration<FileInputStream> enumeration = vector.elements();
            SequenceInputStream sequence = new SequenceInputStream(enumeration);
            int i = 0;
            while((i=sequence.read()) != -1) {
                System.out.print((char) i);
            }
            sequence.close();
            input1.close();
            input2.close();
            input3.close();
            input4.close();

        } catch (Exception e) {

        }
    }
}
