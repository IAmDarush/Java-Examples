/**
 * Created by Darush on 1/30/2018.
 */
public class JoinDemo extends Thread{

    @Override
    public void run() {
        for(int i=1; i<=5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Running " + Thread.currentThread().getName() + " " +i);
        }
    }

    public static void main(String[] args) {

        JoinDemo t0 = new JoinDemo();
        JoinDemo t1 = new JoinDemo();
        JoinDemo t2 = new JoinDemo();

        System.out.println("t1 name: " + t1.getName());
        System.out.println("t1 id: " + t1.getId());
        System.out.println("t2 name: " + t2.getName());
        System.out.println("t2 id: " + t2.getId());

        t0.start();
        try {
            t0.join(); // wait for the current thread to finish then start others
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t1.start();
        t2.start();

        t1.setName("Thread-Darush"); // change t1's name
        System.out.println("t1 name changed to : " + t1.getName());

    }

}
