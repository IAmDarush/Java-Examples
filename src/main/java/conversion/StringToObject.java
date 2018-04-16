package main.java.conversion;

import java.util.Date;

public class StringToObject {

    public static void main(String[] args) {

        String s = "Hello";
        String dateString = "java.util.Date";
        try {

            // Every class is a child of Object class
            Object stringObj = s;
            System.out.println(stringObj);

            Class date = Class.forName(dateString);
            System.out.println("Class name: " + date.getName());
            System.out.println("Super class name: " + date.getSuperclass().getName());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
