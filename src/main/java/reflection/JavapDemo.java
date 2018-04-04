package main.java.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


// example: java JavapDemo java.lang.Object
// the above code will print all the fields, constructors
// and methods of the Object class
public class JavapDemo {

    public static void main(String[] args) throws Exception {

        Class c = Class.forName(args[0]);

        System.out.println("------Fields------");
        Field fields[] = c.getDeclaredFields();
        for (int i=0; i<fields.length; i++) {
            System.out.println(fields[i]);
        }

        System.out.println("------Constructors------");
        Constructor constructors[] = c.getDeclaredConstructors();
        for (int i=0; i<constructors.length; i++){
            System.out.println(constructors[i]);
        }

        System.out.println("------Methods------");
        Method methods[] = c.getDeclaredMethods();
        for (int i=0; i<methods.length; i++) {
            System.out.println(methods[i]);
        }

    }

}
