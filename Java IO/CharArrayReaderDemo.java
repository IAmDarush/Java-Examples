import java.io.CharArrayReader;

/**
 * Created by Darush on 1/17/2018.
 */
public class CharArrayReaderDemo {
    public static void main(String[] args) {
        try {
            char[] chars = {'h', 'e', 'l', 'l', 'o', '!', 'w', 'o', 'r', 'l', 'd'};
            CharArrayReader reader = new CharArrayReader(chars);
            int i = 0;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i + ":" + i + "\n");
            }
            reader.close();
            System.out.println("Done...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
