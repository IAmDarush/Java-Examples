package main.java.threads;

/**
 * Created by Darush on 2/5/2018.
 */

public class MultiTaskDemo {

    public static void main(String[] args) {

        Task1 t1 = new Task1();
        Task2 t2 = new Task2();

        // Using anonymous inner class
        Thread t3 = new Thread() {
            @Override
            public void run() {
                System.out.println("Task 3");
            }
        };

        // Using anonymous inner class that extends runnable
        Runnable r4 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task 4");
            }
        };
        Thread t4 = new Thread(r4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}

class Task1 extends Thread {
    @Override
    public void run() {
        System.out.println("Task 1");
    }
}

class Task2 extends Thread {
    @Override
    public void run() {
        System.out.println("Task 2");
    }
}