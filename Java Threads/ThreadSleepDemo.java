/**
 * Created by Darush on 1/29/2018.
 */
public class ThreadSleepDemo extends Thread {

    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        ThreadSleepDemo t1 = new ThreadSleepDemo();
        ThreadSleepDemo t2 = new ThreadSleepDemo();

        t1.start();
        t2.start();

    }

}
