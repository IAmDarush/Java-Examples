package main.java.threads;

/**
 * Created by Darush on 1/28/2018.
 */
public class ThreadDemo extends Thread{

    @Override
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {

        ThreadDemo thread1 = new ThreadDemo();
        thread1.start();

    }

}
