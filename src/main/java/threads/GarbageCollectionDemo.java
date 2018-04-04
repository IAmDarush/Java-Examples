package main.java.threads;

/**
 * Created by Darush on 2/5/2018.
 */
public class GarbageCollectionDemo {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is garbage collected");
    }

    public static void main(String[] args) {

        GarbageCollectionDemo gc1 = new GarbageCollectionDemo();
        GarbageCollectionDemo gc2 = new GarbageCollectionDemo();

        gc1 = null;
        gc2 = null;

        System.gc();

    }

}
