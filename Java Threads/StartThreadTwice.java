/**
 * Created by Darush on 1/29/2018.
 */
public class StartThreadTwice extends Thread {

    @Override
    public void run() {

        System.out.println("Thread is running...");

    }

    public static void main(String[] args) {

        StartThreadTwice t1 = new StartThreadTwice();

        t1.start();
        t1.start(); // will through IlligalThreadStateException

    }

}
