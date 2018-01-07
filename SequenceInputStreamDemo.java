import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

/**
 * Created by Darush on 1/7/2018.
 */
public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        try {
            // Read from two files and write into third file
            FileInputStream fin1 = new FileInputStream("files/string.txt");
            FileInputStream fin2 = new FileInputStream("files/bouttest.txt");
            FileOutputStream fout = new FileOutputStream("files/sequence.txt");
            SequenceInputStream sequenceInputStream = new SequenceInputStream(fin1, fin2);
            int j;
            while ((j = sequenceInputStream.read()) != -1) {
                fout.write(j);
                System.out.print((char) j);
            }
            sequenceInputStream.close();
            fin1.close();
            fin2.close();


            // Read data using enumeration

        } catch (Exception e) {

        }
    }
}
