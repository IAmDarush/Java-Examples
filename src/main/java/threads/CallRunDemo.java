package main.java.threads;

/**
 * Created by Darush on 1/30/2018.
 */
public class CallRunDemo extends Thread {

    @Override
    public void run() {
        for (int i=0; i<5; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Running " + i);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {

        CallRunDemo t1 = new CallRunDemo();
        CallRunDemo t2 = new CallRunDemo();

        t1.run(); // will be treated as normal object not thread object
        t2.run(); // will be treated as normal object not thread object

    }

}
