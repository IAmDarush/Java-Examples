package main.java.threads;

/**
 * Created by Darush on 2/4/2018.
 */

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Shut down hook task completed...");
    }
}

public class ShutdownHookDemo {

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        runtime.addShutdownHook(new MyThread());

        System.out.println("Thread will complete after 4 seconds...press ctrl+c to exit immediately");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




    }

}
