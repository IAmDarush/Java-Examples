import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by Darush on 1/9/2018.
 */
public class DataInputStreamDemo {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("files/doutTest.txt");
            DataInputStream din = new DataInputStream(inputStream);
            int count = inputStream.available();
            byte[] bytes = new byte[count];
            din.read(bytes);
            for (byte b : bytes) {
                System.out.print((char) b + "-");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
