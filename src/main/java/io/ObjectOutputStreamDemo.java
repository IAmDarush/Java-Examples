package main.java.io;

import java.io.*;

/**
 * Created by Darush on 1/26/2018.
 */
public class ObjectOutputStreamDemo {

    public static void main(String[] args) {

        Student student = new Student(1, "Darush", 30);

        try {
            FileOutputStream fileOutput = new FileOutputStream("files/object.txt");
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);

            objectOutput.writeObject(student);
            objectOutput.close();
            System.out.println("Success");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
