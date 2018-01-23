import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Darush on 1/6/2018.
 */
public class BufferedOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("files/bouttest.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            String s = "Hello World!";
            byte[]  bytes = s.getBytes();
            bout.write(bytes);
            bout.flush();
            bout.close();
            fout.close();
            System.out.println("Success...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
