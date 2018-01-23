import java.io.FileReader;
import java.io.Reader;

/**
 * Created by Darush on 1/15/2018.
 */
public class ReaderDemo {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("files/test.txt");
            int data = reader.read();
            while (data != -1){
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
            System.out.println("\nDone...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
