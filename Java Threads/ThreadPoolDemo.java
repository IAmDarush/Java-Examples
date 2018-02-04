import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Darush on 2/3/2018.
 */
public class ThreadPoolDemo {

    public static void main(String[] args) {

        // Create a pool of 5
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for(int i=0; i<10; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);
        }

        executor.shutdown();

        while(!executor.isTerminated()) {}

        System.out.println("Finished all threads");
    }

}
