package main.java.threads;

import java.io.IOException;

/**
 * Created by Darush on 2/5/2018.
 */
public class RuntimeDemo {

    public static void main(String[] args) {

        try {

            // Open a new notepad
            Runtime.getRuntime().exec("notepad");

            // Shutdown the PC after 60 minutes
            Runtime.getRuntime().exec("shutdown -s -t 3600");
            // wait for 3 seconds
            Thread.sleep(3000);
            // Stop shutdown process
            Runtime.getRuntime().exec("shutdown -a");

            // Show available number of processors
            System.out.println("Available processors: "
            + Runtime.getRuntime().availableProcessors());

            // Free memory and total memory
            Runtime runtime = Runtime.getRuntime();
            System.out.println("Total memory: " + runtime.totalMemory()/1024 + " KB");
            System.out.println("Free memory: " + runtime.freeMemory()/1024 + " KB");

            // create 10000 instances and free the memory afterwards
            for (int i=0; i<10000; i++) {
                new RuntimeDemo();
            }
            System.out.println("After creating 10,000 instances, Free Memory = " + runtime.freeMemory()/1024 + " KB");
            System.gc();
            System.out.println("After gc(), Free Memory= " + runtime.freeMemory()/1024 + " KB");

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }





    }

}
