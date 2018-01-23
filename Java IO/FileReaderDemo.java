import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Darush on 1/16/2018.
 */
public class FileReaderDemo {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("files/test.txt");
            int c = fileReader.read();
            while (c != -1) {
                System.out.print((char) c);
                c = fileReader.read();
            }
            fileReader.close();
            System.out.println("\nSuccess...");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
