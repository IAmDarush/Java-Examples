/**
 * Created by Darush on 1/28/2018.
 */
public class RunnableDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {

        RunnableDemo runnable = new RunnableDemo();
        Thread thread = new Thread(runnable);
        thread.start();

    }

}
