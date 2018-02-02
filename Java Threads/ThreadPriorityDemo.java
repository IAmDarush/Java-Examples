/**
 * Created by Darush on 2/2/2018.
 */
public class ThreadPriorityDemo extends Thread {

    @Override
    public void run() {
        System.out.println("Running thread name: " + Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName() + " priority: " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {

        ThreadPriorityDemo t1 = new ThreadPriorityDemo();
        ThreadPriorityDemo t2 = new ThreadPriorityDemo();

        t1.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();

    }

}
