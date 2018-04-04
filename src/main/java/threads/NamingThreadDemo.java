package main.java.threads;

/**
 * Created by Darush on 2/2/2018.
 */
public class NamingThreadDemo extends Thread{

    @Override
    public void run() {
        System.out.println("Running Thread: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        NamingThreadDemo t1 = new NamingThreadDemo();
        NamingThreadDemo t2 = new NamingThreadDemo();

        System.out.println("Name of t1: " + t1.getName());
        System.out.println("Name of t2: " + t2.getName());

        t1.start();
        t2.start();

        t1.setName("t1");
        t2.setName("t2");

        System.out.println("Name of t1 after change: " + t1.getName());
        System.out.println("Name of t2 after change: " + t2.getName());

    }

}
