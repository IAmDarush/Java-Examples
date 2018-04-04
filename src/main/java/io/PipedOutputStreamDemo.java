package main.java.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by Darush on 1/25/2018.
 */
public class PipedOutputStreamDemo {

    public static void main(String[] args) {

        final PipedOutputStream pipedOutput = new PipedOutputStream();
        final PipedInputStream pipedInput = new PipedInputStream();

        try {
            pipedOutput.connect(pipedInput);

            Thread writerThread = new Thread(){
                @Override
                public void run() {
                    for(int i=65; i<=90; i++) {
                        try {
                            pipedOutput.write(i);
                            Thread.sleep(200);
                        } catch (IOException | InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            };

            Thread readerThread = new Thread() {
                @Override
                public void run() {
                    try {
                        for(int i=65; i<=90; i++) {
                            System.out.println(pipedInput.read());
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            };

            writerThread.start();
            readerThread.start();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
