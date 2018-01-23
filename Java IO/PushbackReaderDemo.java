import java.io.CharArrayReader;
import java.io.PushbackReader;

/**
 * Created by Darush on 1/20/2018.
 */
public class PushbackReaderDemo {
    public static void main(String[] args) {
        try {
            char chars[] = {'1', '-', '-','2','-', '3', '4', '-', '-', '-', '5', '6'};
            CharArrayReader reader = new CharArrayReader(chars);
            PushbackReader pushback = new PushbackReader(reader);
            int i;
            while((i = pushback.read()) != -1) {
                if(i == '-') {
                    int j;
                    if((j = pushback.read()) == '-') {
                        System.out.print("#*");
                    } else {
                        pushback.unread(j);
                        System.out.print((char) i);
                    }
                } else {
                    System.out.print((char) i);;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
