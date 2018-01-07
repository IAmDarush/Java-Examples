import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Darush on 1/6/2018.
 */
public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("files/bouttest.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while ((i = bin.read()) != -1) {
                System.out.print((char) i);
            }
            bin.close();
            fin.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
