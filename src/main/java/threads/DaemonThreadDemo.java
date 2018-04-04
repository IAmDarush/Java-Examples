package main.java.threads;

/**
 * Created by Darush on 2/3/2018.
 */
public class DaemonThreadDemo extends Thread {

    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread is working " + Thread.currentThread().getName());
        } else {
            System.out.println("User thread is working" + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {

        DaemonThreadDemo t1 = new DaemonThreadDemo();
        DaemonThreadDemo t2 = new DaemonThreadDemo();
        DaemonThreadDemo t3 = new DaemonThreadDemo();

        t1.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();
    }

}
