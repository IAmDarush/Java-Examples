package main.java.io;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by Darush on 1/24/2018.
 */
public class FileDescriptorDemo {

    public static void main(String[] args) {

        FileDescriptor fileDescriptor = null;
        byte[] bytes = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58};

        try{
            FileOutputStream output = new FileOutputStream("files/test.txt");
            fileDescriptor = output.getFD();
            output.write(bytes);
            output.flush();
            fileDescriptor.sync();

            FileInputStream input = new FileInputStream("files/test.txt");
            int value = 0;
            while((value = input.read()) != -1) {
                char c = (char) value;
                System.out.print(c);
            }
            System.out.println("\nSync() successfully done!!");

        } catch (Exception e){
            System.out.println(e);
        }

    }

}
